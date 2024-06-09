package com.moneyheist.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.moneyheist.loans.controller") })
@EnableJpaRepositories("com.moneyheist.loans.repository")
@EntityScan("com.moneyheist.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "MoneyHeistBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Mihir Atrey",
						email = "developer@moneyheist.com",
						url = "https://www.moneyheist.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.moneyheist.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "MoneyHeistBank Loans microservice REST API Documentation",
				url = "https://www.moneyheist.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
