package com.me.scores.service;

import com.me.scores.model.baseball.BaseballBoxScore;
import com.me.scores.model.baseball.mlb.MlbSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class ScoreService {

    @Autowired
    BaseballService baseballService;

    // TODO: Change to Scoreboard object
    public Mono<MlbSchedule> getScoreboard(String date, String sportId, Integer homeTeam, Integer awayTeam) {
        // This can be changed to any {sport}Service
        // Each service will contain the individual
        // leagues (e.g. footBallService.getNflScores)
        // or all (e.g. footBallService.getAllScores)
        return baseballService.getAllScoresForDate(date);
    }

    public Mono<BaseballBoxScore> getBoxScore(Integer gameId) {
        //          return baseballService.getBoxScore(gameId);
        return null;
    }
}
