package com.me.scores.model;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;
    private List<Tenure> history;
    private List<Award> awardList;
}
