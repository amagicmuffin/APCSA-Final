import java.util.ArrayList;

public class CombatLevel {
    public CombatLevel() {
        System.out.println("works22");
    }

    // temp test
    public static void main(String[] args) {
        ArrayList<Entity> eList = new ArrayList<>();
        
        eList.add(new Entity());
        
        Entity newFireball = new Fireball();
        eList.add(newFireball);

        for(Entity e : eList)
            System.out.println(e);

        System.out.println(eList.get(0).getid());
        System.out.println(eList.get(1).getid());
    }
}
