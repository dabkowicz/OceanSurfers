package com.logic.game.input;

public class InputHandler {
    private float tiltX;
    private float tiltY;

    //this method will be called by Android when it senses the phone moving
    public void updateInput(float x, float y) {
        this.tiltX = x;
        this.tiltY = y;
    }

    public float getTiltX() { return tiltX; }
    public float getTiltY() { return tiltY; }
}