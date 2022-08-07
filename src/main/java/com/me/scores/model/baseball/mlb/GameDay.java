package com.me.scores.model.baseball.mlb;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.me.scores.model.Event;
import com.me.scores.model.Game;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GameDay {

    private String date;

    private Integer totalItems;

    private Integer totalEvents;

    private Integer totalGames;

    private Integer totalGamesInProgress;

    @JsonProperty("games")
    private List<MlbGame> games;

    private List<Event> events;
}
