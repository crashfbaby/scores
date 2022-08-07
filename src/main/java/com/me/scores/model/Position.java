package com.me.scores.model;

import lombok.Data;

import java.util.List;

@Data
public class Position {

    private Position name;

    // e.g. my ROLES as Commissioner
    // infield, outfield
    private List<Role> roleList;
}
