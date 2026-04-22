package com.logic.game.player;
import com.logic.game.utils.Vector2D;

public class Fish {
    private Vector2D position; // pozycja
    private int width = 50;    // jak szeroka jest (do kolizji)
    private int height = 30;   // jak wysoka jest

    public Fish(float startX, float startY) {
        //pozycja startowa
        this.position = new Vector2D(startX, startY);
    }

    //sterowanie ryba
    public void move(float tiltX, float tiltY) {
        //tiltX przechylenie telefonu na boki
        position.x += tiltX * 5;

        //tiltY to pochylenie przod/tyl - wplywa na predkosc y
        position.y += tiltY * 2;

        //zabezpieczenie: ryba nie może wyplynac poza ekran zalozona szereokosc 500
        if (position.x < 0) position.x = 0;
        if (position.x > 450) position.x = 450;
    }

    // getter pozwalajacy innym klasom na sprawdzenie polozenia ryby
    public Vector2D getPosition() {
        return position;
    }
}