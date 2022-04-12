package Entities;

import Logic.Environment;

public class BossTomato extends Enemy {
    public BossTomato(Environment e, int i, int j) {
        super(e, i, j);
        super.setId("B" + super.getId().substring(1));
        tile = 'X';
    }

    @Override
    public void tick() {
//        System.out.println(this.getId() + " was ticked");
    }

    /**
     * pulls player 2 tiles closer, in the direction that the player is closest
     * for example, if the boss is three tiles up and four tiles to the right of the player,
     * this pulls the player
     */
    public void pullAtk() {

    }
}
