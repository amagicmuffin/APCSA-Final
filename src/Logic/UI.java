package Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static final String line = "########################################\n";
    public static final String emptyLine = "#                                      #\n";
    public static final int width = 40;
    public static final int height = 20;
    private static Scanner scan = new Scanner(System.in);

    /**
     * Prints out many newlines
     */
    public static void simpleClearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    /**
     * Prints out item 0, prompts for user input, prints out item 0 and 1, prompts for user input, etc
     */
    public static void simpleDialogue(String[] dialogue) {
        for(int i = 0; i < dialogue.length; i++) {
            simpleClearScreen();
            for(int j = 0; j <= i; j++) {
                System.out.println(dialogue[j]);
            }
            System.out.println("[Enter] to continue.");
            scan.nextLine();
        }
    }

    // TODO clean this up so it can be used on its own and then delete the final static variables in this class
    /**
     * Prints out a dialogue.
     * Dialogues are split into blocks by user RET.
     * Blocks are split into lines.
     * @param dialogue Each item will be a block of text.
     *                 Each item of an item will be a line.
     *                 A line should be shorter than this.width - 4 characters.
     *                 There should be less than this.height - 4 lines.
     */
    public static void dialogueBoxPrint(String[][] dialogue) {
        // i is a String[] block of text
        // each iteration of this loop is a block of text
        // that the user can RET to get next block
        for(int i = 0; i < dialogue.length; i++) {
            int linesPrinted = 0;
            
            simpleClearScreen();

            String output = "";
            output += line;
            output += emptyLine;
    
            // add all lines of dialogue
            // j is a String[] block of text, starting from 0 and going to 
            // how many blocks that the player has read
            for(int j = 0; j <= i; j++) {
                // add all lines from each block
                for (String line : dialogue[j]) {
                    linesPrinted++;
                    
                    output += "# ";
                    output += line;
        
                    // add spacer " " until end of ui box
                    // width - 4 - line.length() gets the number of spaces needed
                    for (int n = 0; n < width - 4 - line.length() ; n++) {
                        output += " ";
                    }

                    // "cap" the end
                    output += " #\n";
                }
            }

            // add notification line
            linesPrinted++;
            output += "# [Enter] to continue.                 #\n";
            
            // add spacer rows until end of ui box
            for (int n = 0; n < height - 4 - linesPrinted; n++) {
                output += emptyLine;
            }
    
            output += emptyLine;
            output += line;
    
            System.out.println(output);

            scan.nextLine();
        }            
    }

    /**
     * Prints out the map from a given Environment
     */
    public static void printMap(Environment environment) {
        char[][] map = environment.getMap();

        String output = "";

        for(char[] row : map) {
            for(char tile : row) {
                output += tile;
                output += " ";
            }
            output += "\n";
        }

        System.out.println(output);
    }

    /**
     * Renders an Environment (including the map, current objective, and dialogue).
     * If dialogue is queued for the Environment, let user [ENTER] through it
     */
    public static void renderEnvironment(Environment e) {
        while (e.hasNextDialogue()) {
            renderDialogue(e.getObjective(), fmtMap(e.getMap()), e.nextDialogue());
        }
        renderDialogue(e.getObjective(), fmtMap(e.getMap()), new String[][]{{""}});
    }

    /**
     * "compresses" a 2d char map into a 1d String map where each item is a row.
     * There is a space after each char.
     */
    private static String[] fmtMap(char[][] map) {
        String[] ans = new String[map.length];
        for(int row = 0; row < map.length; row++) {
            ans[row] = "";
            for(char tile : map[row]) {
                ans[row] += tile + " ";
            }
        }

        return ans;
    }

    private static void renderDialogue(String objective, String[] map, String[][] diag) {
        for(String[] block : diag) {
            renderBlock(objective, map, block);
        }
    }

    private static void renderBlock(String objective, String[] map, String[] text) {
        int lineIndex = 0;
        for(; lineIndex < text.length; lineIndex++) {
            System.out.print(map[lineIndex] + text[lineIndex] + "\n");
        }

        System.out.print(map[lineIndex] + "[ENTER] to continue.\n");
        lineIndex++;

        for(; lineIndex < map.length; lineIndex++) {
            System.out.print(map[lineIndex] + "\n");
        }

        scan.nextLine();
    }
}
