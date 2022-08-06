package com.me.scores.service;

import com.me.scores.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ScoreService {

    @Autowired
    BaseballService baseballService;

    ScoreService () {

    }

    public Mono<Schedule> getScores(Integer homeTeam, Integer awayTeam) {
        return baseballService.getAllScores();
    }
}