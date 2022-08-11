package com.me.scores.model.baseball;

import com.me.scores.model.Team;

import java.util.List;

public class BaseballScoreboard {

    private List<BaseballGame> games;

    //--------------------------------------------------------------------------
    // NOTE: THE BELOW PROPERTIES MIGHT BE OVERWRITTEN IF THEY ARE A PART OF THE
    // TEAM OBJECT IN THE API RESPONSE OR THERE IS A "THEME" APPLIED (note to self:
    // implement themes)
    //--------------------------------------------------------------------------
    private String homePrimaryColor;

    private String homeSecondaryColor;

    private String homeLogoName;

    private String awayPrimaryColor;

    private String awaySecondaryColor;

    private String awayLogoName;
}
