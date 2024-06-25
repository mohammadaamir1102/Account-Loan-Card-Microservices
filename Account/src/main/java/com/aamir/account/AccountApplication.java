package com.aamir.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl") // this is for enabling the BaseEntity auditing scenarios like createAt, createdBy etc.
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Khan Accounts microservice REST API Documentation",
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
				description =  "Khan Accounts microservice REST API Documentation",
				url = "http://localhost:8080/swagger-ui.html"
		)
)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
