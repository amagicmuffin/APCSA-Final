public abstract class Entity {
    private String id;
    private int iPos;
    private int jPos;
    private static int nextId = 0;
    
    public Entity() {
        this.id = "E" + nextId;
        nextId++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * should check if i,j of e same as i,j of this
     * @param e todo fill this out later
     * @return todo fill this out later
     */
    public boolean overlaps(Entity e) {
        return true;  // WARNING THIS IS PLACEHOLDER
    }

    public abstract void tick();
}
