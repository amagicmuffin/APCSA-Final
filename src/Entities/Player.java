package Entities;

import Logic.Environment;

public class Player extends Entity {
    String facing;

    public Player(Environment e, String facing) {
        super(e);
        super.setId("P" + super.getId().substring(1));
        this.facing = facing;
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }
}
