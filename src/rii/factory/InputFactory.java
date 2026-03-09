package rii.factory;

import java.util.Scanner;

/*
 * Input Factory
 * Creates Scanner object.
 */
public class InputFactory {
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
