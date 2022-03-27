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
     * prints out many newlines
     */
    public static void simpleClearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    /**
     * prints out item 0, prompts for user input, prints out item 0 and 1, prompts for user input, etc
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

    /**
     * prints out a dialogue
     * dialogues are split into blocks by user RET
     * blocks are split into lines
     * @param dialogue each item will be a block of text
     *                 each item of an item will be a line
     *                 a line should be shorter than this.width - 4 characters
     *                 there should be less than this.height - 4 lines
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
     * prints out the map from a given Environment
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

    // TODO use recursion:
    // render(Environ), do a dialogue, remove the dialogue, after user [ENTER], render(the new Environ)
    /**
     * Takes an Environment as a parameter.
     * Renders that Environment (including the map, current goal, and dialogue)
     * If dialogue is queued for the Environment, let user [ENTER] through it
     */
    public static void render(Environment environment) {

    }
}
