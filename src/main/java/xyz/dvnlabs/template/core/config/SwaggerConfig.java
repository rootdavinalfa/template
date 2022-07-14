package xyz.dvnlabs.template.core.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI templateOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Template API")
                        .description("Template sample application")
                        .version("v0.0.1"));
    }

}
