package com.me.scores.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Game {


    // Where we playin'?
    String locationId;
    String locationName;

    //
    // Who's playin'?
    //
    Team homeTeam;
    Team awayTeam;

}
