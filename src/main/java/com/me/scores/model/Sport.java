package com.me.scores.model;

import com.me.scores.model.mlb.enums.Category;

import java.util.List;


public abstract class Sport {

    public String name;

    public List<League> leagueList;

    List<Category> categoryList;
}
