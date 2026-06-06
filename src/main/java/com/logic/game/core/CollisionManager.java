package com.logic.game.core;

import com.logic.game.player.Fish;
import com.logic.game.utils.Vector2D;
import com.logic.game.obstacles.Obstacle;
import java.util.List;

public class CollisionManager {
    public boolean isColliding(Fish fish, Vector2D objectPos) {
        float dx = fish.getPosition().x - objectPos.x;
        float dy = fish.getPosition().y - objectPos.y;
        float distance = (float) Math.sqrt(dx * dx + dy * dy);
        return distance < 40;
    }

    public boolean checkCollisions(Fish fish, List<Obstacle> obstacles) {
        for (Obstacle obs : obstacles) {
            if (isColliding(fish, obs.getPosition())) return true;
        }
        return false;
    }
}