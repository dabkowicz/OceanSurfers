package com.logic.game.core;

import com.logic.game.player.Fish;
import com.logic.game.obstacles.ObstacleManager;
import com.logic.game.bonuses.BonusManager;
import com.logic.game.world.DifficultyManager;
import com.logic.game.utils.Constants;

public class GameEngine {
    private Fish fish;
    private ObstacleManager obstacleManager;
    private BonusManager bonusManager;
    private CollisionManager collisionManager;
    private DifficultyManager difficultyManager;

    //new classes instead of regular variables
    private ScoreSystem scoreSystem;
    private GameState currentState;

    public GameEngine() {
        this.scoreSystem = new ScoreSystem();
        this.currentState = GameState.MENU; //game starts in menu
        resetGame(); //preparation of objects
    }

    //method for restarting the game (to avoid writing the same thing twice)
    public void resetGame() {
        this.fish = new Fish(Constants.PLAYER_START_X, Constants.PLAYER_START_Y);
        this.obstacleManager = new ObstacleManager();
        this.bonusManager = new BonusManager();
        this.collisionManager = new CollisionManager();
        this.difficultyManager = new DifficultyManager();
        this.scoreSystem.reset();
    }

    //method to change state (e.g. you click START in the menu)
    public void startGame() {
        resetGame();
        currentState = GameState.PLAYING;
    }

    public void update(float inputX, float inputY) {
        //the logic works ONLY when the state is PLAYING
        if (currentState != GameState.PLAYING) return;

        difficultyManager.update();
        float speedMult = difficultyManager.getGameSpeedMultiplier();
        float spawnMult = difficultyManager.getSpawnRateMultiplier();

        fish.update(inputX, inputY);
        obstacleManager.setDifficultyMultiplier(speedMult);
        obstacleManager.update();
        bonusManager.update();

        //spawning
        if (Math.random() < 0.02 * spawnMult) obstacleManager.spawnObstacle();
        if (Math.random() < 0.01) bonusManager.spawnBonus();

        //collision
        if (collisionManager.checkCollisions(fish, obstacleManager.getObstacles())) {
            currentState = GameState.GAME_OVER;
        }

        handleBonusCollection();
    }

    private void handleBonusCollection() {
        for (int i = bonusManager.getBonuses().size() - 1; i >= 0; i--) {
            if (collisionManager.isColliding(fish, bonusManager.getBonuses().get(i).getPosition())) {
                scoreSystem.addPoints(bonusManager.getBonuses().get(i).getType().getPoints());
                bonusManager.getBonuses().remove(i);
            }
        }
    }

    //getters
    public GameState getCurrentState() { return currentState; }
    public ScoreSystem getScoreSystem() { return scoreSystem; }
    public Fish getFish() { return fish; }
}