package com.example.rick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RickAndMortyJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RickAndMortyJavaApplication.class, args);
    }

    @Bean
    WebClient defineWebClient() {
        return WebClient.builder().baseUrl("https://rickandmortyapi.com/").build();
    }
}
