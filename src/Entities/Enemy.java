package Entities;

import Logic.Environment;

public abstract class Enemy extends Entity {
    protected int hp;

    public Enemy(Environment e, int i, int j) {
        super(e, i ,j);
        super.setId("N" + super.getId().substring(1));
    }

    /**
     * checks if this Enemy is in range to attack a player
     */
    public boolean inRange(Player player) {
        return true;  // TODO
    }

    /**
     * Makes this entity take 1 hp of damage.
     * @return true if this Enemy should die
     */
    public boolean takeDamage() {
        hp--;
        return hp <= 0;
    }
}
