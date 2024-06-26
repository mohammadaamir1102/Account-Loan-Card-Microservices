package com.aamir.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.loans.controller") })
@EnableJpaRepositories("com.eazybytes.loans.repository")
@EntityScan("com.eazybytes.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "khanBank Loans microservice REST API Documentation",
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
				description =  "Khan Loan microservice REST API Documentation",
				url = "http://localhost:8090/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
