package Entities;

public class Tomato extends SpawnableEnemy {
    public Tomato() {
        super();
        super.setId("T" + super.getId().substring(1));
    }

    @Override
    public void tick() {
        System.out.println(this.getId() + " was ticked");
    }
}
