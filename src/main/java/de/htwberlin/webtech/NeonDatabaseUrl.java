package de.htwberlin.webtech;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/*
Converts a Neon connection string (postgresql://user:pass@host/db?sslmode=require), as provided in
DATABASE_URL_UNPOOLED / DATABASE_URL, into the spring.datasource.* properties.
The direct (unpooled) URL is preferred: the app keeps its own Hikari pool and runs schema updates.
If neither variable is set, the JDBC_DATABASE_* variables from application.properties are used.
 */
final class NeonDatabaseUrl {

    private NeonDatabaseUrl() {}

    static void apply(Map<String, String> env) {
        String raw = firstNonBlank(env.get("DATABASE_URL_UNPOOLED"), env.get("DATABASE_URL"));
        if (raw == null || !(raw.startsWith("postgres://") || raw.startsWith("postgresql://"))) {
            return;
        }
        URI uri = URI.create(raw);
        String jdbcUrl = "jdbc:postgresql://" + uri.getHost()
                + (uri.getPort() > 0 ? ":" + uri.getPort() : "")
                + uri.getRawPath()
                + (uri.getRawQuery() != null ? "?" + uri.getRawQuery() : "?sslmode=require");
        System.setProperty("spring.datasource.url", jdbcUrl);

        String userInfo = uri.getRawUserInfo();
        if (userInfo != null) {
            int colon = userInfo.indexOf(':');
            String user = colon >= 0 ? userInfo.substring(0, colon) : userInfo;
            System.setProperty("spring.datasource.username", decode(user));
            if (colon >= 0) {
                System.setProperty("spring.datasource.password", decode(userInfo.substring(colon + 1)));
            }
        }
    }

    private static String decode(String s) {
        return URLDecoder.decode(s, StandardCharsets.UTF_8);
    }

    private static String firstNonBlank(String a, String b) {
        if (a != null && !a.isBlank()) return a;
        if (b != null && !b.isBlank()) return b;
        return null;
    }
}
