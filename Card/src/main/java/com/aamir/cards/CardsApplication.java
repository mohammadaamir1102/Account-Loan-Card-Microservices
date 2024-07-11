package com.aamir.cards;

import com.aamir.cards.config.CardsContactInfoConfig;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
@EnableJpaRepositories("com.eazybytes.cards.repository")
@EntityScan("com.eazybytes.cards.model")*/
@EnableConfigurationProperties(value = {CardsContactInfoConfig.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "khanBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Aamir Khan",
						email = "aamirtech1102@gmail.com",
						url = "https://github.com/mohammadaamir1102"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/mohammadaamir1102"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Khan Card microservice REST API Documentation",
				url = "http://localhost:9000/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
