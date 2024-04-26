package org.ankit.springbootopenapi3.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Boot OpenAPI 3")
                        .version("1.0")
                        .description("This is a sample Spring Boot application using OpenAPI 3")
                );
    }
}