package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        closeAnswer();
    }

    public static String closeAnswer() {
        int rm = new Random().nextInt(3);
        String answer = "Может быть.";
        new Random().nextInt(3);
        if (rm == 0) {
            answer = "Да";
        } else if (rm == 1) {
            answer = "Нет";
        }
        System.out.println(answer);
        return answer;
    }
}
