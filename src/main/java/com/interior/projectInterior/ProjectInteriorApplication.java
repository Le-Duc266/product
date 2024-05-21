package com.interior.projectInterior;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@OpenAPIDefinition(info = @Info(title = "EXAMPLE API", version = "1.0"),
        servers = {@Server(url = "/", description = "Default Server URL")},
        security = {@SecurityRequirement(name = "Authorization")})
@ComponentScan("com.interior.projectInterior.repository")
public class ProjectInteriorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectInteriorApplication.class, args);
    }

}
