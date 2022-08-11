package com.me.scores.model;

import com.me.scores.model.enums.Category;
import lombok.Data;

import java.util.List;

public enum Sport {

    UNKNOWN("-1", "{sport.name.unknown}"),
    BASEBALL("1", "{sport.name.baseball}"),
    FOOTBALL("2", "{sport.name.football}"),
    BASKETBALL("3", "{sport.name.basketball}"),
    SOCCER("4", "{sport.name.soccer}"); // This one has 2 entries. "Soccer" and "The rest of the world"

    private final String sportId;

    private final String languageString;

    Sport(String sportId, String languageString) {
        this.sportId = sportId;
        this.languageString = languageString;
    }

    public String getSportId() {
        return sportId;
    }

    public static Sport getById(String sportId) {
        for (Sport s : values()) {
            if(s.sportId.equals(sportId)) return s;
        }
        return UNKNOWN;
    }

    // TODO: Implement
    private static String leagues; //(e.g. BASEBALL(1, "MLB, NIPPON") )

    // TODO: Implement
    private List<Category> categoryList;
}
