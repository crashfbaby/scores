package com.me.scores.controller;

import com.me.scores.entity.ScoreRequest;
import com.me.scores.model.baseball.mlb.MlbSchedule;
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

    @GetMapping("/scoreboard")
    @ResponseBody
    public Mono<MlbSchedule> getScoreboard(String date, String sportId){
        // TODO: Split out into getScoreBoardForSport, "ForHomeTeam, "ForAwayTeam, "ForDate
        return scoreService.getScoreboard(date, sportId, null, null);
    }

    // getBoxScore



}
