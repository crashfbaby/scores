package com.me.scores.model;

import com.me.scores.model.enums.Category;
import lombok.Data;

import java.util.List;

public class Sport {

    public enum name {
        BASEBALL, BASKETBALL, FOOTBALL, SOCCER;
    }

    private static List<League> leagueList;

    private List<Category> categoryList;
}
