package com.me.scores.service;

import com.me.scores.client.MlbClient;
import com.me.scores.model.Sport;
import com.me.scores.model.baseball.BaseballBoxScore;
import com.me.scores.model.baseball.mlb.MlbSchedule;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

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
        // TODO: Phillies @ Mets game on 4/24/2019 (gamePk=565997):
        // String path = "v1/game/565997/boxscore";
        return null;
    }

    //public Mono<BaseballPlayByPlay> getLiveMlbGameData(String gameId) {
    // https://statsapi.mlb.com/api/v1.1/game/661049/feed/live
    //}

}
