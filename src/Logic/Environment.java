package Logic;

import Entities.*;
import java.util.ArrayList;

/**
 * This class stores all the data and methods to simulate an environment.
 * This does not include methods to render the environment.
 * All things that have to do with what a user can see are in UI.java.
 */
public class Environment {
    public static final char FLOOR_TILE = '.';
    private char[][] map;
    private String objective;
    private ArrayList<String[][]> dialogueQueue;
    private ArrayList<Enemy> enemyList;
    private ArrayList<Fireball> fireballList;
    private int timesMoved;  // TODO use for tutorial and keeping track of BossTomato pullatk?

    public Environment(char[][] map) {
        this.map = map;
        this.objective = "";
        this.dialogueQueue = new ArrayList<>();
        this.enemyList = new ArrayList<>();
        this.fireballList = new ArrayList<>();
    }

    // METHODS FOR char[][] map VARIABLE
    public char[][] getMap() {
        return map;
    }

    public void setTile(int i, int j, char t) {
        map[i][j] = t;
    }

    /**
     * Returns true if the tile at i,j is empty.
     * This is used to check if an entity can move to it.
     */
    public boolean emptyTileAt(int i, int j) {
        return map[i][j] == FLOOR_TILE;
    }

    // METHODS FOR String objective VARIABLE
    public String getObjective() {
        return objective;
    }

    public void setObjective(String o) {
        objective = o;
    }

    // METHODS FOR ArrayList<String[][]> dialogueQueue VARIABLE ////////////////////

    /**
     * Returns true if dialogueQueue has dialogue queued.
     * Aka: returns true if dialogueQueue is not empty
     */
    public boolean hasNextDialogue() {
        return dialogueQueue.size() != 0;
    }

    /**
     * Returns next dialogue (at index 0 of dialogueQueue) and deletes that dialogue.
     */
    public String[][] nextDialogue() {
        String[][] ans = dialogueQueue.get(0);

        dialogueQueue.remove(0);

        return ans;
    }

    /**
     * Adds a dialogue to the right end of dialogueQueue.
     * A dialogue should be a String[][] where an item is a block and an item of an item is a line of text.
     */
    public void addDialogueToQ(String[][] dialogue) {
        dialogueQueue.add(dialogue);
    }

    // METHODS FOR ArrayList<Enemy> enemyList VARIABLE ////////////////////
    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    /**
     * Adds an enemy to enemyList and puts it on the map.
     */
    public void spawnEnemy(Enemy enemy) {
        enemyList.add(enemy);
        map[enemy.getiPos()][enemy.getjPos()] = enemy.getTile();
    }

    /**
     * Removes the enemy at an index of enemyList
     */
    public void despawnEnemy(int index) {
        enemyList.remove(index);
    }

    /**
     * @deprecated there shoooouldn't be any reason to uses it because despawnEnemy(int index) shooould handle it.
     * Removes an enemy at iPos, jPos from enemyList if one exists.
     * Maybe remove this later?
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

    // METHODS FOR ArrayList<Fireball> fireballList VARIABLE ////////////////////
    public ArrayList<Fireball> getFireballList() {
        return fireballList;
    }

    // MISC METHODS ////////////////////
    /**
     * Updates all non-player Entities by one game tick.
     * Updates all Enemies first, then all Fireballs. This is because of how game logic works.
     * (To prevent Tomatoes from "phasing through" Fireballs)
     */
    public void update() {
        // ticks all entities
        for(Enemy enemy : getEnemyList()) enemy.tick();
        for(Fireball fireball : getFireballList()) fireball.tick();

        // environmental things below

    }
}