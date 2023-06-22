package com.julianr0223.movierecommendation;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Schema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.text.html.HTML;

@SpringBootApplication
//@OpenAPIDefinition
public class MovierecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovierecommendationApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("API Documentation").version("1.0"));
	}
}
