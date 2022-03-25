import java.util.ArrayList;

public class CombatLevel {
    public CombatLevel() {
        System.out.println("DEBUG: reached CombatLevel constructor");
    }

    // temp test
    public static void main(String[] args) {
        ArrayList<Entity> eList = new ArrayList<>();
        
        eList.add((Entity)(new Tomato()));

        for(Entity e : eList)
            System.out.println(e);
        System.out.println("\n\n");

        Entity f = new Tomato();
        System.out.println("getid: " + f.getId());
    }
}
