package ru.job4j.pojo;

public class Librery {
    public static void main(String[] args) {
        Book book1 = new Book("OCA / OCP Programmer Java", 580);
        Book book2 = new Book("OCA / OCP Professional Java", 720);
        Book book3 = new Book("Grokajem algoritm", 480);
        Book book4 = new Book("Clean code", 419);

        Book[] books = {book1, book2, book3, book4};
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPagenumbers());
        }
        System.out.println("*******");
        System.out.println("Do transposition books[0] and books[3]:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPagenumbers());
        }
        System.out.println("*******");
        System.out.println("Out books \"Clean code\"");
        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPagenumbers());
            }
        }
    }
}
