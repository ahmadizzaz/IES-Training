package com.izzaz.mission3;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Repository
public interface GameRepository {

    List<Game> gameList = new ArrayList<>();

    //create
     int addGame(Game game);

    //Get game based on id
     Game getGame(Integer gameId) ;

    //Get all games
     List<Game> getGameList() ;

    //Update a game entry using id
     int gameUpdate(Integer gameId, Game newGame);


    //Delete game entry
     int deleteGame(Integer gameId);
}

