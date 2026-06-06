package com.logic.game.obstacles;

import com.logic.game.utils.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObstacleManager {
    private List<Obstacle> obstacles;
    private Random random;
    private float difficultyMultiplier = 1.0f;

    public ObstacleManager() {
        this.obstacles = new ArrayList<>();
        this.random = new Random();
    }

    public void setDifficultyMultiplier(float multiplier) {
        this.difficultyMultiplier = multiplier;
    }

    public void spawnObstacle() {
        ObstacleType[] types = ObstacleType.values();
        ObstacleType randomType = types[random.nextInt(types.length)];
        float randomX = random.nextInt(Constants.SCREEN_WIDTH - 50);
        float speed = randomType.getDefaultSpeed() * difficultyMultiplier;

        obstacles.add(new Obstacle(randomX, Constants.SPAWN_Y, randomType, speed));
    }

    public void update() {
        for (int i = obstacles.size() - 1; i >= 0; i--) {
            Obstacle o = obstacles.get(i);
            o.update();
            if (o.getPosition().y > Constants.SCREEN_HEIGHT) {
                obstacles.remove(i);
            }
        }
    }

    public List<Obstacle> getObstacles() { return obstacles; }
}