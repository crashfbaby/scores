package com.me.scores.model;

import lombok.Data;

import java.util.Date;

@Data
public class Tenure {

    private Date startDate;

    private Date endDate;

    private Role role;
}
