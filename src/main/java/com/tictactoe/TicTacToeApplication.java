package com.tictactoe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.tictactoe.model.Player;
import com.tictactoe.repository.PlayerRepository;

@SpringBootApplication
public class TicTacToeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PlayerRepository playerRepository) {
		return (args) -> {

			// save a couple of players
			playerRepository.save(new Player("ashwani", "ashwani@gmail.com", new BCryptPasswordEncoder().encode("ashwani")));
			playerRepository.save(new Player("vikram", "vikram@gmail.com", new BCryptPasswordEncoder().encode("vikram")));

		};
	}

}
