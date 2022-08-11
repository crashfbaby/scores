package com.me.scores.model.baseball.mlb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class MlbSchedule {

    private Integer totalItems;

    private Integer totalEvents;

    private Integer totalGames;

    private Integer totalGamesInProgress;

    @JsonProperty("dates")
    private List<MlbGameDay> dates;
}
