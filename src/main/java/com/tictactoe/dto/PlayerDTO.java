package com.tictactoe.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDTO {

	@NotNull
	private String userName;
	@NotNull
	private String password;
	@NotNull
	private String email;
}
