package de.htwberlin.webtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WebtechApplication {

	public static void main(String[] args) {
		NeonDatabaseUrl.apply(System.getenv());
		SpringApplication.run(WebtechApplication.class, args);
	}








}
