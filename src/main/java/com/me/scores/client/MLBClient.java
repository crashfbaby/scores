package com.me.scores.client;

import com.me.scores.model.baseball.mlb.Schedule;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
//import org.springframework.web.reactive.function.client;

//@Bean
public class MLBClient {
    private final WebClient webClient;

    public MLBClient() {
        this.webClient = WebClient.builder()
                .baseUrl("https://statsapi.mlb.com/api")
                .build();
    }

    // TODO: Change return type to BaseballGame
    public Mono<Schedule> getScheduledGames(LocalDate date, String sportId) {
        return webClient.get()
                 .uri(builder -> builder.path("/v1/schedule")
                                .queryParam("date", date)
                                .queryParam("sportId", sportId)
                                .build())
                 .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                 .retrieve()
                 .bodyToMono(Schedule.class);
    }
}
