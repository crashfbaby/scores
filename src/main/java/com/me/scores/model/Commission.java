package com.me.scores.model;

import lombok.Data;

import java.util.List;

@Data
public abstract class Commission {

    private Person commissioner;
    private List<League> leagueList;

}
