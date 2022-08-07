package com.me.scores.model.baseball;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.me.scores.model.Game;
import com.me.scores.model.Sport;
import com.me.scores.model.Team;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseballGame extends Game {

    @Builder(builderClassName = "ballgame")
    public BaseballGame(Team homeTeam, Team awayTeam, String locationName, Date startTime)  {
        super(homeTeam, awayTeam, locationName, startTime);
        super.setSport(Sport.name.BASEBALL);
    }

    Integer currentInning;
    private Boolean isEnded;
    private Integer endInning;

}
