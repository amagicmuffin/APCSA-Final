import java.util.ArrayList;

public class CombatLevel {
    public CombatLevel() {
        System.out.println("test");
    }

    // temp test
    public static void main(String[] args) {
        ArrayList<Entity> eList = new ArrayList<>();
        
        eList.add(new Entity());
        eList.add((Entity)(new Fireball()));

        for(Entity e : eList)
            System.out.println(e);


    }
}
