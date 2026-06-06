package com.logic.game.obstacles;

public enum ObstacleType {
    SHARK(10, 5.0f),
    ROCK(20, 2.0f),
    NET(5, 3.0f);

    private final int damage;
    private final float defaultSpeed;

    ObstacleType(int damage, float defaultSpeed) {
        this.damage = damage;
        this.defaultSpeed = defaultSpeed;
    }

    public int getDamage() { return damage; }
    public float getDefaultSpeed() { return defaultSpeed; }
}