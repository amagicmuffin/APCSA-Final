package Entities;

import Logic.Environment;

public class Tomato extends SpawnableEnemy {
    public Tomato(Environment e, int i, int j) {
        super(e, i, j);
        super.setId("T" + super.getId().substring(1));
        tile = 'o';
    }

    @Override
    public void tick() {
//        System.out.println(this.getId() + " was ticked");
    }
}
