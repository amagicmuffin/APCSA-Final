package Levels;

import java.util.Scanner;

public class TutorialLevel {
    public TutorialLevel() {
        Scanner scan = new Scanner(System.in);
        while(!scan.next().equalsIgnoreCase("q"))
            System.out.println("Tut works");
    }
}
