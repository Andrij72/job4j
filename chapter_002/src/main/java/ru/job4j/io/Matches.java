package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int count = 11;
    static boolean run = true;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int user1 = 0;
        int user2 = 0;
        while (run) {
            if (checkWinner("user1")) {
                run = false;
                break;
            }

            if (checkWinner("user2")) {
                run = false;
                break;
            }
        }
    }

    public static boolean checkWinner(String user) {
        boolean res = false;
        System.out.println("Please, " + user + " take your matches 1...3" + "\n");
        input.hasNext();
        int value = Integer.valueOf(input.nextInt());
        count -= value;
        System.out.println("There left  <<" + count + ">>  mathers");
        if (count == 0) {

            System.out.println(user + " is winner");
            res = true;
        }
        return res;
    }
}
