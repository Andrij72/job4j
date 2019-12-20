package ru.job4j.oop;


/**
 * Class   demonstrate method with arguments *
 *  *
 *  * @author Andrey Kulynych
 *  * @version 1.0
 *  * @since 12.10.2019
 */
public class Jukebox {

    /**
     * Method music
     * @param position
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox menu = new Jukebox();
        menu.music(2);
        menu.music(1);
        menu.music(3);
    }
}
