package com.me.scores.model.baseball.mlb;

import com.me.scores.model.Team;
import com.me.scores.model.baseball.BaseballGame;

import java.util.Date;

public class MlbGame extends BaseballGame {
    private final Integer REGULATION_LENGTH = 9;

    private String gamePk;

    public MlbGame(Team homeTeam, Team awayTeam, String locationName, Date startTime) {
        super(homeTeam, awayTeam, locationName, startTime);
    }
}
