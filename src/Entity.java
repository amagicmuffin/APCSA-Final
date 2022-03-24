public class Entity {
    private int id;
    private static int nextId = 0;
    
    public Entity() {
        this.id = nextId;
        nextId++;
    }

    public int getid() {
        return id;
    }
}
