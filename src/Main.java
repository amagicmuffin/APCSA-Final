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
        char[][] map = {
                {'1','2'},
                {'3','4'},
                {'5','6'}
        };

        Environment walmart = new Environment(map);

        UI.printMap(walmart);
    }
}
