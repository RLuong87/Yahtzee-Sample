package com.company;

import java.util.Scanner;

public class CLI {

    public static Scanner scanner = new Scanner(System.in);

    public static String getStr(String question) {

        while (true) {
            System.out.println(question);
            String userStr = scanner.nextLine();

            if (!userStr.equals("")) {
                return userStr;
            } else {
                System.out.println("Error: Please enter a name");
            }
        }
    }

    public static int getInt(String question, int min, int max) {

        while (true) {
            System.out.println(question);
            int userInt = scanner.nextInt();

            if (userInt < min || userInt > max) {
                System.out.println("Error: Enter a number between " + min + " & " + max);
            } else {
                return userInt;
            }
        }
    }

    public static void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
        scanner.close();
    }

    public static String pressEnter() {
        return scanner.nextLine();
    }
}
