package com.me.scores.service;

import com.me.scores.client.MLBClient;
import com.me.scores.model.mlb.Schedule;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Service
public class BaseballService {
    private MLBClient mlbClient;

    public BaseballService() {
        this.mlbClient = new MLBClient();
    }

    public Mono<Schedule> getAllScores(){
        System.out.println("TODO: getAllScores");
        return getMLBScores();
        // TODO: return MLB Scores + Other League Scores
    }

    public Mono<Schedule> getMLBScores(){
        return mlbClient.getScheduledGames(LocalDate.now(), Integer.toString(1));
    }

}
