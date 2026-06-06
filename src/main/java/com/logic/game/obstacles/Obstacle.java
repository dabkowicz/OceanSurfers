package com.logic.game.obstacles;

import com.logic.game.utils.Vector2D;

public class Obstacle {
    private Vector2D position;
    private ObstacleType type;
    private float currentSpeed;


    public Obstacle(float x, float y, ObstacleType type, float speed) {
        this.position = new Vector2D(x, y);
        this.type = type;
        this.currentSpeed = speed;
    }

    public void update() {
        position.y += currentSpeed;
    }

    public Vector2D getPosition() { return position; }
}