package com.logic.game.player;

public class PlayerPhysics {
    private final float ACCELERATION_SENSITIVITY = 0.5f;
    private final float FRICTION = 0.9f;
    private final float MAX_VELOCITY = 15.0f;

    private float velocityX = 0;
    private float velocityY = 0;

    public float calculateNewVelocityX(float tiltX) {
        velocityX += tiltX * ACCELERATION_SENSITIVITY;
        velocityX *= FRICTION;
        if (velocityX > MAX_VELOCITY) velocityX = MAX_VELOCITY;
        if (velocityX < -MAX_VELOCITY) velocityX = -MAX_VELOCITY;
        return velocityX;
    }

    public float calculateNewVelocityY(float tiltY) {
        velocityY += tiltY * ACCELERATION_SENSITIVITY;
        velocityY *= FRICTION;
        if (velocityY > MAX_VELOCITY) velocityY = MAX_VELOCITY;
        if (velocityY < 1.0f) velocityY = 1.0f; // Ryba nie płynie do tyłu
        return velocityY;
    }
}