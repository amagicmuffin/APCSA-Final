package Entities;

import Logic.Environment;

public class Fireball extends Entity {
    String facing;

    /**
     * Creates a fireball that goes off in direction facing
     * @param facing "l", "r", "u", or "d" to start facing left, right, up, or down
     */
    public Fireball(Environment e, String facing) {
        super(e);
        super.setId("F" + super.getId().substring(1));
        this.facing = facing;
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }
}
