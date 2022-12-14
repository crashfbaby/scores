package com.me.scores.service;

import com.me.scores.client.MlbClient;
import com.me.scores.client.ClientValues;
import com.me.scores.model.Sport;
import com.me.scores.model.baseball.BaseballBoxScore;
import com.me.scores.model.baseball.mlb.MlbSchedule;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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

        return mlbClient.get()
                .uri(builder -> builder.path(ClientValues.API.V1_SCHEDULE)
                        .queryParam(ClientValues.PARAM.DATE, date)
                        .queryParam(ClientValues.PARAM.SPORT_ID, Sport.BASEBALL.getSportId())
                        .build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(MlbSchedule.class);

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
