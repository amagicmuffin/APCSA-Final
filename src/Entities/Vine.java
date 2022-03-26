package Entities;

import Logic.Environment;

public class Vine extends SpawnableEnemy {
    public Vine(Environment e) {
        super(e);
        super.setId("V" + super.getId().substring(1));
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }
}
