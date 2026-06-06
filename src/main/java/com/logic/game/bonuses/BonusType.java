package com.logic.game.bonuses;

public enum BonusType {
    PLANKTON(50),
    BUBBLE(0),
    SPEED_BOOST(10);

    private final int points;

    BonusType(int points) {
        this.points = points;
    }

    public int getPoints() { return points; }
}