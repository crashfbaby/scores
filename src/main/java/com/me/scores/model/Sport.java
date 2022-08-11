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

    private String sportId;

    // TODO: nameString for i18n
    Sport(String sportId, String defaultLanguageString) {
    }

    public String id() {
        return this.sportId;
    }

    public static Sport getById(String sportId) {
        for (Sport s : values()) {
            if(s.sportId.equals(sportId)) return s;
        }
        return UNKNOWN;
    }

    private static String leagues; //(e.g. BASEBALL(1, "MLB, NIPPON") )

    private List<Category> categoryList;
}
