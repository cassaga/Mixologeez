package com.mixologeez.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200") // Remplacez par l'URL de votre front-end
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Autorisez les méthodes HTTP nécessaires
                        .allowedHeaders("Content-Type", "Authorization", "Content-Length", "X-Requested-With");
            }
        };
    }
}
