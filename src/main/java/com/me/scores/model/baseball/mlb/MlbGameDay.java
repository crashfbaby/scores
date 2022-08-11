package com.me.scores.model.baseball.mlb;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.me.scores.model.Event;
import lombok.Data;

import java.util.List;

@Data
public class MlbGameDay {

    private String date;

    private Integer totalItems;

    private Integer totalEvents;

    private Integer totalGames;

    private Integer totalGamesInProgress;

    private List<MlbGame> games;

    private List<Event> events;

}
