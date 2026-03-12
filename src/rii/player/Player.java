package rii.player;

/*
 * Singleton Pattern
 * Ensures only one instance of Player exists.
 */
public class Player {
    private static Player instance;

    private Player() {
        System.out.println("Single Player Mode Activated");
    }

    // Public static getInstance()
    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }
}
