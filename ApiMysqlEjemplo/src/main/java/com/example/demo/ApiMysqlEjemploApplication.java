package com.example.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableJpaAuditing
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.example.demo.repository"})
public class ApiMysqlEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMysqlEjemploApplication.class, args);
	}

}
