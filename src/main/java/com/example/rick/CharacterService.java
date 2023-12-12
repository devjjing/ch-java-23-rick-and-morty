package com.example.rick;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final WebClient webClient;

    public List<Character> findStations() {
        RickResponse response = Objects.requireNonNull(
                        webClient
                                .get()
                                .uri("/api/character/466")
                                .retrieve()
                                .toEntity(RickResponse.class)
                                .block()
                )
                .getBody();

        List<Character> characters = new ArrayList<>();
        for (RickResult result : Objects.requireNonNull(response).results()) {
            characters.add(
                    new Character(result.dst_nr(), result.characterDescription())
            );
        }
        return characters;
    }
}