package Entities;

import Logic.Environment;

public abstract class SpawnableEnemy extends Enemy {
    public SpawnableEnemy(Environment e, int i, int j) {
        super(e, i, j);
        super.setId("S" + super.getId().substring(1));
    }
}
