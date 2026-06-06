package com.logic.game.bonuses;

import com.logic.game.utils.Vector2D;

public class Bonus {
    private Vector2D position;
    private BonusType type;
    private float speed = 3.0f;

    public Bonus(float x, float y, BonusType type) {
        this.position = new Vector2D(x, y);
        this.type = type;
    }

    public void update() {
        position.y += speed;
    }

    public Vector2D getPosition() { return position; }
    public BonusType getType() { return type; }
}