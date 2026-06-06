package com.logic.game.utils;

public class Timer {
    private long lastTime;
    private float interval;

    public Timer(float intervalInSeconds) {
        this.interval = intervalInSeconds * 1000;
        this.lastTime = System.currentTimeMillis();
    }

    public boolean isReady() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime > interval) {
            lastTime = currentTime;
            return true;
        }
        return false;
    }

    public void setInterval(float newInterval) {
        this.interval = newInterval * 1000;
    }
}