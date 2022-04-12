package Entities;

import Logic.Environment;

public class Vine extends SpawnableEnemy {
    public Vine(Environment e, int i, int j) {
        super(e, i, j);
        super.setId("V" + super.getId().substring(1));
        tile = '$';
    }

    @Override
    public void tick() {
//        System.out.println(this.getId() + " was ticked");
    }
}
