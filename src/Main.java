import Levels.CombatLevel;
import Logic.*;

public class Main {
    public static void main(String[] args) {
        // UI.dialogueBoxPrint test
        /*
        String[][] longer = {
            {
                "These are not my teardrops,",
                "   daughter dear"
            },
            {
                "But just a sheen of dew,",
                "   that lingers here"
            },
            {
                "Past other fields, ",
                "   where other fathers lie"
            },
            {
                "Who kept their daughters",
                "   better far then I"
            }            
        };
        
        UI.dialogueBoxPrint(longer);
        */

        // UI.printMap test
        /*
        char[][] map = {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        };

        String[] text = {
                "yes",
                "yes2"
        };

        Environment walmart = new Environment(map);

        walmart.addDialogueToQ(new String[][]{text});

        UI.renderEnvironment(walmart);
        */

        new CombatLevel();
    }
}
