package com.me.scores.controller;

import com.me.scores.entity.ScoreRequest;
import com.me.scores.model.baseball.mlb.Schedule;
import com.me.scores.service.ScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;


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
