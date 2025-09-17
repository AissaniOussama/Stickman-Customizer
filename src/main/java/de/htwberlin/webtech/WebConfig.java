package de.htwberlin.webtech;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/* Central Web-Configuration
allowing HTTP-Methods : GET, POST, PUT, DELETE, OPTIONS for "https://frontendstickman.onrender.com"
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    //Enabeling the HTTP-Methods
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://frontendstickman.onrender.com")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
} 