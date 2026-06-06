package com.logic.game;

import com.logic.game.core.GameEngine;
import com.logic.game.core.GameState;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GameEngine engine = new GameEngine();

        //the start of the game because its now in the MENU by default
        engine.startGame();

        System.out.println("--- SIMULATION RUNNING ---");

        for (int i = 0; i < 100; i++) {
            //FIX: check the status instead of the old method
            if (engine.getCurrentState() == GameState.GAME_OVER) {
                System.out.println("Collision! final score: " + engine.getScoreSystem().getCurrentScore());
                break;
            }

            engine.update(0.5f, 0.2f);

            if (i % 10 == 0) {
                //FIX: we are getting the result from the points system
                System.out.println("Cage " + i + " | Fish position: X=" + (int)engine.getFish().getPosition().x +
                        " | POINTS: " + engine.getScoreSystem().getCurrentScore());
            }
            Thread.sleep(50);
        }
    }
}