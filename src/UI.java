import java.util.Scanner;

/**
 * This class'll have to be renamed later.
 */
public class UI {
    public static final String line = "########################################\n";
    public static final String emptyLine = "#                                      #\n";
    public static final int width = 40;
    public static final int height = 20;
    private static Scanner scan = new Scanner(System.in);

    public static void simpleClearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

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

    // dialogues are split into blocks by user RET
    // blocks are split into lines
    /**
     * prints out a dialogue
     * @param dialogue each item will be a line that is printed out.
     *                 a line should be shorter than this.width - 4 characters
     *                 there should be less than this.height - 4 lines
     */
    public static void dialogueOnlyPrint(String[][] dialogue) {
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

    // TODO
    //public static void print(Map map) {
    //
    //}
}
