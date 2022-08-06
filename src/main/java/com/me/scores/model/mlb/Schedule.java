package com.me.scores.model.mlb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.nio.charset.Charset;
import java.util.List;


@Data
public class Schedule {

    private Integer totalItems;

    private Integer totalEvents;

    private Integer totalGames;

    private Integer totalGamesInProgress;

    @JsonProperty("dates")
    private List<GameDay> gameDays;
}
