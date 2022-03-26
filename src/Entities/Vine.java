package Entities;

public class Vine extends SpawnableEnemy {
    public Vine() {
        super();
        super.setId("V" + super.getId().substring(1));
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }
}
