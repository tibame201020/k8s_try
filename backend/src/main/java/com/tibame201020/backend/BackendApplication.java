package com.tibame201020.backend;

import com.tibame201020.backend.domain.EntityObj;
import com.tibame201020.backend.jpa.EntityObjJpa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tibame201020.backend.jpa")
@EnableR2dbcRepositories(basePackages = "com.tibame201020.backend.r2dbc")
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner run(EntityObjJpa entityObjJpa) {
		return args -> {
			for (int i = 0; i < 11; i++) {
				entityObjJpa.saveAndFlush(EntityObj.builder().createTime(LocalDateTime.now()).build());
			}

		};
	}
}
