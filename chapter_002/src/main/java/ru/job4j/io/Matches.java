package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input1 = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("First user,  please take your matches 1...3" + "\n");
            input1.hasNext();
            int user1 = Integer.valueOf(input1.nextInt());
            count -= user1;
            System.out.println("There left  <<" + count + ">>  mathers");
            if (count == 0) {
                System.out.println("First user is winner");
                run = false;
            }
            System.out.println("Second user,  please take your matches 1...3" + "\n");
            input1.hasNext();
            int user2 = Integer.valueOf(input1.nextInt());
            count -= user2;
            System.out.println("There left  <<" + count + ">>  mathers");
            if (count == 0) {
                System.out.println("Second user is winner");
                run = false;
            }
        }
    }
}
