package Entities;

import Logic.Environment;

public class Player{
    private static int iPos;
    private static int jPos;
    private static String facing;

    public static int getiPos() {
        return iPos;
    }

    public static void setiPos(int iPos) {
        Player.iPos = iPos;
    }

    public static int getjPos() {
        return jPos;
    }

    public static void setjPos(int jPos) {
        Player.jPos = jPos;
    }

    public static String getFacing() {
        return facing;
    }

    public static void setFacing(String facing) {
        Player.facing = facing;
    }
}
