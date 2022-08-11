package com.me.scores.model.baseball.mlb;

import lombok.Data;

@Data
public class MlbPlayingTeam {

    private MlbLeagueRecord leagueRecord;

    private Integer score;

    private MlbTeam team;

}
