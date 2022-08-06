package com.me.scores.model;

import lombok.Data;

import java.nio.charset.Charset;


@Data
public class Schedule {

    private Integer totalItems;

    private Integer totalEvents;

    private Integer totalGames;

    private Integer totalGamesInProgress;

    public String toString(Charset utf8) {
        return utf8.name();
    }
}
