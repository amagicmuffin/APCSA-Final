package Entities;

import Logic.Environment;

public class Tomato extends SpawnableEnemy {
    public Tomato(Environment e) {
        super(e);
        super.setId("T" + super.getId().substring(1));
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }
}
