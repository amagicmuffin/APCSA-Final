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
        boolean canMove = super.currentEnvironment.emptyTileAt(super.iPos, super.jPos);
        if(canMove) {
            move(facing);
        }
    }

    /**
     * Helper function
     */
    private void move(String direction) {
        switch(direction) {
            case "l":
                super.jPos--;
                break;
            case "r":
                super.jPos++;
                break;
            case "u":
                super.iPos--;
                break;
            case "d":
                super.iPos++;
                break;
        }

        super.currentEnvironment.updateMap();
    }
}
