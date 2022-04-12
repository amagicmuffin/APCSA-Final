package Entities;

import Logic.Environment;

public class Fireball extends Entity {
    private String facing;

    /**
     * Creates a fireball that goes off in direction facing
     * @param facing "l", "r", "u", or "d" to start facing left, right, up, or down
     */
    public Fireball(Environment e, String facing, int i, int j) {
        super(e, i, j);
        super.setId("F" + super.getId().substring(1));
        this.facing = facing;
        tile = '%';
    }

    @Override
    public void tick() {
//        System.out.println(this.getId() + " was ticked");
        // boolean canMove = super.currentEnvironment.emptyTileAt(super.iPos, super.jPos);
        // if(canMove) {
        //     move(facing);
        // }

        //tryMove(facing);
    }

    private void move(String direction) {
        
    }
    
    /**
     * Helper function
     */
    // private void move(String direction) {
    //     if(direction.equals("l")) super.jPos--;
    //     if(direction.equals("r")) super.jPos++;
    //     if(direction.equals("u")) super.iPos--;
    //     if(direction.equals("d")) super.iPos++;
        
    //     super.currentEnvironment.updateMap();
    // }
}
