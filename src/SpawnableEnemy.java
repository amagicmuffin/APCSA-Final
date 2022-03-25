public abstract class SpawnableEnemy extends Entity {
    public SpawnableEnemy() {
        super();
        super.setId("S" + super.getId().substring(1));
    }
}
