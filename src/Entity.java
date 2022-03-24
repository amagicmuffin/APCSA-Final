public class Entity {
    private String id;
    private static int nextId = 0;
    
    public Entity() {
        // in child classes, replace E with what class they are
        // Fireball = F, Enemy = N, etc
        this.id = "E" + nextId;
        nextId++;
    }

    public String getid() {
        return id;
    }
}
