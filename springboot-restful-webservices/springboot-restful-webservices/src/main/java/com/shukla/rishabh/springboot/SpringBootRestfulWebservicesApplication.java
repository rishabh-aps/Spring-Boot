package com.shukla.rishabh.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "Spring Boot REST API Documentation",
        description = "Spring Boot REST API Documentation",
        version = "v1.0",
        contact = @Contact(
                name = "Rishabh",
                email = "rishabh@gmail.com",
                url = "https://www.rishabhx.com"
        ),
        license = @License(
                name = "Apache 2.0",
                url = "https://www.rishabhx.com/licence"
        )
),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation",
                url = "https://www.rishabhx.com/user_management.html"
        )
)
public class SpringBootRestfulWebservicesApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootRestfulWebservicesApplication.class, args);
    }

}