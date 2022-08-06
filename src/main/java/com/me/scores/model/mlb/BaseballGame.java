package com.me.scores.model.mlb;

import com.me.scores.model.Game;

public class BaseballGame extends Game {

    Integer REGULATION_LENGTH = 9;
    Integer currentInning;

    private Integer homeScore;
    private Integer homeHits;
    private Integer homeErrors;
    private Integer awayScore;
    private Integer awayHits;
    private Integer awayErrors;

}
