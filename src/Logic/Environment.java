package Logic;

import Entities.*;
import java.util.ArrayList;

public class Environment {
    private char[][] map;
    private String objective;
    private ArrayList<String[][]> dialogueQueue = new ArrayList<>();
    private ArrayList<Enemy> enemyList = new ArrayList<>();
    private ArrayList<Fireball> fireballList = new ArrayList<>();
    private int timesMoved;  // TODO use for tutorial and keeping track of BossTomato pullatk?

    // METHODS FOR String objective VARIABLE
    public String getObjective() {
        return objective;
    }

    public void setObjective(String o) {
        objective = o;
    }

    // METHODS FOR ArrayList<String[][]> dialogueQueue VARIABLE ////////////////////
    /**
     * Returns next dialogue (at index 0 of dialogueQueue) and deletes that dialogue.
     */
    public String[][] nextDialogue() {
        return new String[][]{};
    }

    /**
     * @param dialogue adds this to the right end of dialogueQueue
     */
    public void addDialogueToQ(String[][] dialogue) {

    }

    // METHODS FOR ArrayList<Enemy> enemyList VARIABLE ////////////////////
    /**
     * @param enemy added to enemyList
     */
    public void spawnEnemy(Enemy enemy) {
        enemyList.add(enemy);
    }

    /**
     * @param index Removes the enemy at this index of enemyList
     */
    public void despawnEnemy(int index) {
        enemyList.remove(index);
    }

    /**
     * @deprecated there shoooouldn't be any reason to uses it because despawnEnemy(int index) shooould handle it
     * Removes an enemy at iPos, jPos from enemyList if one exists
     */
    @Deprecated
    public void despawnEnemy(int iPos, int jPos) {
        System.out.println("Stop using this.");
    }

    /**
     * "Attacks" a tile by damaging an enemy at iPos, jPos from enemyList if one exists there
     * (This will call despawnEnemy on the enemy if its hp drops to 0 because of this)
     */
    public void damageTile(int iPos, int jPos) {
        /*
        for index in enemyList
          if index.coords == iPos,jPos:
            boolean shouldKill = enemyList[index].damage();
            if shouldKill: despawnEnemy(index)
            break;
         */
    }

    // MISC METHODS ////////////////////
    /**
     * Updates all non-player Entities by one game tick
     */
    public void tick() {
        for(Enemy e : enemyList) {
            e.tick();
        }

        for(Fireball f : fireballList) {
            f.tick();
        }
    }
}