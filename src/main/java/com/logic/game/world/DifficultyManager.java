package com.logic.game.world;

public class DifficultyManager {
    private float gameSpeedMultiplier = 1.0f;
    private float spawnRateMultiplier = 1.0f;
    private long startTime;
    private int currentLevel = 1;

    public DifficultyManager() {
        this.startTime = System.currentTimeMillis();
    }

    public void update() {
        long elapsedSeconds = (System.currentTimeMillis() - startTime) / 1000;
        if (elapsedSeconds > currentLevel * 15) {
            currentLevel++;
            gameSpeedMultiplier += 0.2f;
            spawnRateMultiplier += 0.1f;
        }
    }

    public float getGameSpeedMultiplier() { return gameSpeedMultiplier; }
    public float getSpawnRateMultiplier() { return spawnRateMultiplier; }
}