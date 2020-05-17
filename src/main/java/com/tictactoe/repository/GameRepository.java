package com.tictactoe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tictactoe.enums.GameStatus;
import com.tictactoe.enums.GameType;
import com.tictactoe.model.Game;


@Repository
public interface GameRepository extends CrudRepository<Game, Long>{
    List<Game> findByGameTypeAndGameStatus(GameType GameType, GameStatus GameStatus);
    List<Game> findByGameStatus(GameStatus gameStatus);
}
