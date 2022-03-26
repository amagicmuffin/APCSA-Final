package Logic;

import java.util.ArrayList;

public class Environment {
    private static char[][] map;
    private static String objective;
    private static ArrayList<String[][]> dialogueQueue = new ArrayList<>();

    public static void setObjective(String o) {
        objective = o;
    }
}