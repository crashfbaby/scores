package com.me.scores.model.baseball.mlb;

import lombok.Data;

import java.util.Date;

@Data
public class MlbGame {

    private final Integer REGULATION_LENGTH = 9;

    private String gamePk;

    private String link;

    private String gameType;

    private String season;

    private Date gameDate;

    private String officialDate;

    private MlbPlayingTeams teams;

    //Object in MLB Response. Add if needed.
    //private MLBStatus status;

}
