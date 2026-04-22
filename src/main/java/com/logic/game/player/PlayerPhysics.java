package com.logic.game.player;

import com.logic.game.utils.Vector2D;

public class PlayerPhysics {

    private final float ACCELERATION_SENSIVITY = 0.5f;
    private final float FRICTION = 0.9f;    //OPOR WODY SPOWALNIAJACY RYBE gdy nie jest sterowana
    private final float MAX_VELOCITY = 15.0f;

    private float velocityX = 0;
    private float velocityY = 0;

    //do obliczenia nwoej predkosci na podst danych z zyroskopu

    public float calculateNewVelocityX(float tiltX) {
        velocityX += tiltX * ACCELERATION_SENSIVITY;
        velocityX *= FRICTION;  //nalozony opor aby zapobiec slizaganiu sie w nieskonczonosc ryby

        //OGR MAX V
        if (velocityX > MAX_VELOCITY) velocityX = MAX_VELOCITY;
        if (velocityX < -MAX_VELOCITY) velocityX = -MAX_VELOCITY;

        return velocityX;
        }
}

