package com.logic.game.player;

import com.logic.game.utils.Vector2D;
import com.logic.game.utils.Constants;

public class Fish {
    private Vector2D position;
    private PlayerPhysics physics;

    public Fish(float startX, float startY) {
        this.position = new Vector2D(startX, startY);
        this.physics = new PlayerPhysics();
    }

    public void update(float tiltX, float tiltY) {
        position.x += physics.calculateNewVelocityX(tiltX);
        position.y += physics.calculateNewVelocityY(tiltY);

        //wall protection (permanent ones)
        if (position.x < 0) position.x = 0;
        if (position.x > Constants.SCREEN_WIDTH - 50) position.x = Constants.SCREEN_WIDTH - 50;

        if (position.y < 0) position.y = 0;
        if (position.y > Constants.SCREEN_HEIGHT - 50) position.y = Constants.SCREEN_HEIGHT - 50;
    }

    public Vector2D getPosition() {
        return position;
    }
}