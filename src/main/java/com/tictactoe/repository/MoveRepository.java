package com.tictactoe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tictactoe.model.Game;
import com.tictactoe.model.Move;
import com.tictactoe.model.Player;


@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {

    List<Move> findByGame(Game game);
    List<Move> findByGameAndPlayer(Game game, Player player);
    int countByGameAndPlayer(Game game, Player player);
}
