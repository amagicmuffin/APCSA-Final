package Levels;

import java.util.ArrayList;
import Entities.*;
import Logic.Environment;
import Logic.UI;

public class CombatLevel {
    Environment dTree;

    public CombatLevel() {
        System.out.println("DEBUG: reached CombatLevel constructor");
        Player.setiPos(9);
        Player.setjPos(13);


        dTree = new Environment(new char[][]{
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','X','X','X','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','X','X','X','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','X','X','X','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','@','.','@','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
        });
        diagScene();
        bossFightScene();
        creditScene();
    }

    public void diagScene() {
        dTree.addDialogueToQ(new String[][]{
                {
                        "Talcum the Coworker: Oh hey you're back."
                },
                {
                        "[name]: ..."
                },
                {
                        "[name]: talctalctalcithinkijustsawthedevil",
                        "andalsoicandofiremagicnow"
                },
                {
                        "Talcum: Oh ok. Anyways, there was this one",
                        "dude that came in, looked like a bibically",
                        "accurate angel? Interlocking gold wheels",
                        "with infinite eyes, floating because we",
                        "don't care about gravity I guess. Right?"
                },
                {
                        "So it came in through the front door - you",
                        "would've thought it would've busted through",
                        "the ceiling or something, that was kinda",
                        "anticlimatic - and it started screeching",
                        "something about a test and Chosen One and",
                        "fire and my ears are still ringing and it",
                        "zapped those tomato plants over there and",
                        "I think they're evil now."
                },
                {
                        "I think you're supposed to kill it? Yeah",
                        "good luck with that, my shift is over this",
                        "isn't my problem anymore bye."
                }
        });

        UI.renderEnvironment(dTree);
    }

    public void bossFightScene() {
        dTree = new Environment(new char[][]{
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','X','X','X','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','X','X','X','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','X','X','X','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
        });

        dTree.spawnEnemy(new BossTomato(dTree, 3, 3));
        dTree.spawnEnemy(new Vine(dTree, 2, 5));
        dTree.spawnEnemy(new Vine(dTree, 5, 1));

        dTree.update();

        dTree.addDialogueToQ(new String[][]{
                {
                        "As Talcum walks out the door, the writhing",
                        "mass of vines and tomatoes lets out a roar",
                        "(from where? tomatoes don't have vocal cords)",
                        "as several cracks open in the ground.",
                        "A few tomatoes drop off of the main vine",
                        "in the center. The flooring sizzles and",
                        "somewhat dissolves under their splattering",
                        "juice as the tomatoes start hopping towards",
                        "you. Like a pack of kangaroos, or something."
                }
        });


        UI.renderEnvironment(dTree);
//        UI.printMap(dTree);
    }

    public void creditScene() {

    }

    // temp test
    public static void main(String[] args) {
        new CombatLevel();
//        Environment walmart = new Environment();
//
//        ArrayList<Entity> eList = new ArrayList<>();
//
//        eList.add(new Tomato(walmart));
//
//        for(Entity e : eList)
//            System.out.println(e);
//        System.out.println("\n\n");
//
//        Entity f = new Tomato(walmart);
//        System.out.println("getid: " + f.getId());
    }
}
