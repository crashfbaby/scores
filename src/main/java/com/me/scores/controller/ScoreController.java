package com.me.scores.controller;

import com.me.scores.entity.ScoreRequest;
import com.me.scores.model.Schedule;
import com.me.scores.service.ScoreService;
import io.netty.handler.codec.http.HttpResponse;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;


@Controller
public class ScoreController {
    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService){
        this.scoreService = scoreService;
    }

    @GetMapping("/")
    @ResponseBody
    public String scoreController(ScoreRequest scoreRequest)
    {
        return "Hello";
    }

    @GetMapping("/score")
    @ResponseBody
    public Mono<Schedule> getScores(){
        return scoreService.getScores(null, null);
//        String baseURL = "https://statsapi.mlb.com/api/";
//        //String baseURL = "${app.service-calls.baseball-urls.mlb-url}";
//        // TODO: Hardcoded box score to Phillies @ Mets game on 4/24/2019 (gamePk=565997):
//        // TODO: Extract to generic client class
//        String path = "v1/game/565997/boxscore";
//        String url = baseURL + path;
//        WebClient client = WebClient.create(baseURL);
//        return client
//                .get()
//                .uri(path)
//                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .retrieve()
//                .bodyToFlux(DataBuffer.class)
//                // Adjust max size for response
//                .map(buffer -> {
//                    String string = buffer.toString(Charset.forName("UTF-8"));
//                    DataBufferUtils.release(buffer);
//                    return string;
//                });
    }
}
