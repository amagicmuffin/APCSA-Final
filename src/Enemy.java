public abstract class Enemy extends Entity {
    int hp;

    public Enemy() {
        super();
        super.setId("N" + super.getId().substring(1));
    }

    /**
     * checks if this Enemy is in range to attack a player
     */
    public boolean inRange(Player player) {
        return true;  // TODO
    }
}
