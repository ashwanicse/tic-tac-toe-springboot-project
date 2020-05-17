package com.tictactoe.dto;

import com.tictactoe.enums.GameType;
import com.tictactoe.enums.Piece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

	private int id;
	private GameType gameType;
	private Piece piece;
}