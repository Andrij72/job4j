package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int count = 11;
    static boolean run = true;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (run) {
            int user1 = 0;
            int user2 = 0;
            checkWinner("user1");
            checkWinner("user2");
        }
    }

    public static void checkWinner(String user) {
        System.out.println("Please, " + user + "take your matches 1...3" + "\n");
        input.hasNext();
        int value = Integer.valueOf(input.nextInt());
        count -= value;
        System.out.println("There left  <<" + count + ">>  mathers");
        if (count <= 0) {
            System.out.println(user + " is winner");
            run = false;
        }
    }

}
