package com.izzaz.mission7.repository;


import com.izzaz.mission7.entity.Game;
import org.springframework.stereotype.Repository;

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

     int deleteAllGame();
}

