package com.me.scores.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    // Who's playin'?
    private Team homeTeam;
    private Team awayTeam;

    // What're we playin'?
    private Sport sport;

    // When are we playin'?
    private Date startTime;

    // Where we playin'?
    String locationId;
    String locationName;


    public Game(Team homeTeam, Team awayTeam, String locationName, Date startTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.locationName = locationName;
        this.startTime = startTime;
    }
}
