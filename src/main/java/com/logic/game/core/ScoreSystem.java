package com.logic.game.core;

public class ScoreSystem {
    private int currentScore = 0;
    private int highScore = 0;

    public void addPoints(int points) {
        currentScore += points;
    }

    public void reset() {
        if (currentScore > highScore) {
            highScore = currentScore;
        }
        currentScore = 0;
    }

    public int getCurrentScore() { return currentScore; }
    public int getHighScore() { return highScore; }
}