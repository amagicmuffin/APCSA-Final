package Entities;

import Logic.Environment;

public abstract class SpawnableEnemy extends Entity {
    public SpawnableEnemy(Environment e) {
        super(e);
        super.setId("S" + super.getId().substring(1));
    }
}
