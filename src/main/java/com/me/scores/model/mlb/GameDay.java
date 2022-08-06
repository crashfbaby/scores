package com.me.scores.model.mlb;

import com.me.scores.model.Event;
import com.me.scores.model.Game;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GameDay {

    private Date date;

    private Integer totalItems;

    private Integer totalEvents;

    private Integer totalGames;

    private Integer totalGamesInProgress;

    private List<Game> gameList;

    private List<Event> eventList;
}
