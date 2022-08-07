package com.me.scores.model;

import com.me.scores.model.enums.Mascot;
import lombok.Data;

@Data
public class Team {

    private Integer id;

    private String name;

    private String season;

    private String link;

    private String abbreviation;

    private String locationName;

    private Mascot mascot;

    private String primaryColor;

    private String secondaryColor;


}
