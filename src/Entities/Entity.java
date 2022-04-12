package Entities;

import Logic.Environment;

public abstract class Entity {
    protected String id;
    protected static int nextId = 0;
    protected int iPos;
    protected int jPos;
    protected char tile;
    protected Environment currentEnvironment;

    public Entity(Environment e, int i, int j) {
        this.id = "E" + nextId;
        nextId++;

        currentEnvironment = e;
        iPos = i;
        jPos = j;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getiPos() {
        return iPos;
    }

    public void setiPos(int iPos) {
        this.iPos = iPos;
    }

    public int getjPos() {
        return jPos;
    }

    public void setjPos(int jPos) {
        this.jPos = jPos;
    }

    public char getTile() {
        return tile;
    }

    public Environment getCurrentEnvironment() {
        return currentEnvironment;
    }

    public void setCurrentEnvironment(Environment e) {
        currentEnvironment = e;
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
