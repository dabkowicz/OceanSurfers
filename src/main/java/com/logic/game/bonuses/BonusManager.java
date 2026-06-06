package com.logic.game.bonuses;

import com.logic.game.utils.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BonusManager {
    private List<Bonus> bonuses;
    private Random random;

    public BonusManager() {
        this.bonuses = new ArrayList<>();
        this.random = new Random();
    }

    public void spawnBonus() {
        BonusType[] types = BonusType.values();
        BonusType randomType = types[random.nextInt(types.length)];
        float x = random.nextInt(Constants.SCREEN_WIDTH - 50);
        bonuses.add(new Bonus(x, Constants.SPAWN_Y, randomType));
    }

    public void update() {
        for (int i = bonuses.size() - 1; i >= 0; i--) {
            Bonus b = bonuses.get(i);
            b.update();
            if (b.getPosition().y > Constants.SCREEN_HEIGHT) {
                bonuses.remove(i);
            }
        }
    }

    public List<Bonus> getBonuses() { return bonuses; }
}