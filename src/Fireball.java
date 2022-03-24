public class Fireball extends Entity {
    private String id;
    private static int nextId = 0;
    
    public Fireball() {
        super();
        // TODO not working for some reasonid = "F" + id.substring(1);
        id = "F" + id;
        System.out.println("yes");
    }
}
