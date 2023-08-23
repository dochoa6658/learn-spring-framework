package com.udemy.learnspringframwork.game;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GameRunner {

	private MarioGame game;

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
