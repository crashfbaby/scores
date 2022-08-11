package com.me.scores.client;

import com.me.scores.model.baseball.mlb.MlbSchedule;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
//import org.springframework.web.reactive.function.client;

//@Bean
public class MlbClient {
    private final WebClient webClient;

    public MlbClient() {
        super();
        this.webClient = WebClient.builder()
                .baseUrl(ClientValues.BASE_URL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
    
    public WebClient.RequestHeadersUriSpec<?> get() {
        return webClient.get();
    }

    
    public WebClient.RequestHeadersUriSpec<?> head() {
        return webClient.head();
    }

    
    public WebClient.RequestBodyUriSpec post() {
        return webClient.post();
    }

    
    public WebClient.RequestBodyUriSpec put() {
        return webClient.put();
    }

    
    public WebClient.RequestBodyUriSpec patch() {
        return webClient.patch();
    }

    
    public WebClient.RequestHeadersUriSpec<?> delete() {
        return webClient.delete();
    }

    
    public WebClient.RequestHeadersUriSpec<?> options() {
        return webClient.options();
    }

    
    public WebClient.RequestBodyUriSpec method(HttpMethod method) {
        return webClient.method(method);
    }

    
    public WebClient.Builder mutate() {
        return webClient.mutate();
    }
}
