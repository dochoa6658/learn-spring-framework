package com.udemy.learnspringframwork.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class GameRunner {

	@Autowired
	private GamingConsole game;

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
