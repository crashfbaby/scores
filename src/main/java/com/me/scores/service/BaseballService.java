package com.me.scores.service;

import com.me.scores.client.MlbClient;
import com.me.scores.model.baseball.BaseballBoxScore;
import com.me.scores.model.baseball.mlb.MlbSchedule;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Service
public class BaseballService {
    private final MlbClient mlbClient;

    public BaseballService() {
        this.mlbClient = new MlbClient();
    }

    public Mono<MlbSchedule> getAllScoresForDate(String date){
        return getMlbScoresForDate(date); // + getFooLeagueScores() + getBarLeagueScores();
    }

    public Mono<MlbSchedule> getMlbScoresForDate(String date){
        // TODO move all the logic hidden away in getScheduledGames(date,sportId) to here
        return mlbClient.getScheduledGames(date, Integer.toString(1));
    }

    public Mono<BaseballBoxScore> getBoxScoreForGame(String gameId) {
        // TODO: Hardcoded box score to Phillies @ Mets game on 4/24/2019 (gamePk=565997):
        // String path = "v1/game/565997/boxscore";
        return null;
    }

}
