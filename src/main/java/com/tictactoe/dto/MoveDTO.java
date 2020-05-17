package com.tictactoe.dto;

import java.util.Date;

import com.tictactoe.enums.GameStatus;
import com.tictactoe.enums.Piece;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MoveDTO {

	private int boardColumn;
	private int boardRow;
	private Date created;
	private String userName;
	private GameStatus gameStatus;
	private Piece playerPieceCode;
}
