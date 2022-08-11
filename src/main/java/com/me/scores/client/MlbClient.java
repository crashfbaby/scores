package com.me.scores.client;

import com.me.scores.model.baseball.mlb.MlbSchedule;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
//import org.springframework.web.reactive.function.client;

//@Bean
public class MlbClient {
    private final WebClient webClient;

    public MlbClient() {
        this.webClient = WebClient.builder()
                .baseUrl("https://statsapi.mlb.com/api")
                .build();
    }

    // TODO: Make this a proper client class and move all  the path and param building upstream
    // TODO: Change return type to BaseballGame. Map MlbSchedule to List of BaseballGame
    public Mono<MlbSchedule> getScheduledGames(String date, String sportId) {
        return webClient.get()
                 .uri(builder -> builder.path("/v1/schedule")
                                .queryParam("date", date)
                                .queryParam("sportId", sportId)
                                .build())
                 .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                 .retrieve()
                 .bodyToMono(MlbSchedule.class);
    }
}
