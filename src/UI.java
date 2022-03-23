import java.util.Scanner;

/**
 * This class'll have to be renamed later.
 */
public class UI {
    public static final String line = "########################################\n";
    public static final String emptyLine = "#                                      #\n";
    public static final int width = 40;
    public static final int height = 20;

    // TODO make it so that there is String[][] dialogue
    // print out dialogue[0] and wait for player to press RET
    // then print out dialogue[0] and [1] and wait for RET
    // etc
    /**
     * prints out a dialogue
     * @param dialogue each item will be a line that is printed out.
     *                 a line should be shorter than this.width - 4 characters
     *                 there should be less than this.height - 4 lines
     */
    public static void dialogueOnlyPrint(String[] dialogue) {
        String output = "";
        output += line;
        output += emptyLine;

        // add lines of dialogue
        for (String line : dialogue) {
            output += "# ";
            output += line;

            // add spacer " " until end of ui box
            // width - 4 - line.length() gets the number of spaces needed
            for (int i = 0; i < width - 4 - line.length() ; i++) {
                output += " ";
            }

            output += " #\n";
        }

        // add spacer rows until end of ui box
        for (int i = 0; i < height - 4 - dialogue.length; i++) {
            output += emptyLine;
        }

        output += emptyLine;
        output += line;

        System.out.println(output);
    }

    // TODO
    public static void print(Map map) {

    }
}
