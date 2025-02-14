package com.sugarglider.spring.game;

import com.sugarglider.spring.games.MarioGame;
import com.sugarglider.spring.games.PacmanGame;
import com.sugarglider.spring.games.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {

//		MarioGame game = new MarioGame();
//		SuperContraGame superContraGame = new SuperContraGame();
//		PacmanGame pacmanGame = new PacmanGame();
//		GameRunner gameRunner = new GameRunner(game);
//		GameRunner gameRunner1 = new GameRunner(superContraGame);
//		GameRunner gameRunner2 = new GameRunner(pacmanGame);

//		GamingConsole gamingConsole = new MarioGame();
//		GameRunner gameRunner = new GameRunner(gamingConsole);

//		gameRunner.run();
//		gameRunner1.run();
//		gameRunner2.run();

		ConfigurableApplicationContext applicationContext = SpringApplication.run(GameApplication.class, args);
		GameRunner gameRunner = applicationContext.getBean(GameRunner.class);
		gameRunner.run();


	}

}
