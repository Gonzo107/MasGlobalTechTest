package com.masg.example.prueba.driven.web_repository.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${employees.url}")
    private String apiUrl;

    @Bean
    WebClient employeesWebClient() {
        return WebClient.builder().baseUrl(apiUrl).build();
    }
}
