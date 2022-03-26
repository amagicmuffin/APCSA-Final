package Entities;

import Levels.CombatLevel;

public class BossTomato extends Enemy {
    public BossTomato() {
        super();
        super.setId("B" + super.getId().substring(1));
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }

    /**
     * pulls player 2 tiles closer, in the direction that the player is closest
     * for example, if the boss is three tiles up and four tiles to the right of the player,
     * this pulls the player
     */
    public void pullAtk() {

    }
}
