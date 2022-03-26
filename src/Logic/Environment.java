package Logic;

import Entities.*;
import java.util.ArrayList;

public class Environment {
    private static char[][] map;
    private static String objective;
    private static ArrayList<String[][]> dialogueQueue = new ArrayList<>();
    private static ArrayList<Enemy> enemyList = new ArrayList<>();
    private static ArrayList<Fireball> fireballList = new ArrayList<>();
    private static int timesMoved;  // TODO use for tutorial and keeping track of BossTomato pullatk?

    public static String getObjective() {
        return objective;
    }

    public static void setObjective(String o) {
        objective = o;
    }

    /**
     * Returns next dialogue and deletes the dialogue.
     * @return next dialogue, at index 0 of dialogueQueue
     */
    public static String[][] nextDialogue() {
        return new String[][]{};
    }

    /**
     * @param dialogue adds this to the right end of dialogueQueue
     */
    public static void addDialogueToQ(String[][] dialogue) {

    }
}