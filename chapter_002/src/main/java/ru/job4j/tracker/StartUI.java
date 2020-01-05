package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.print("=== You succeed add item " + name + "!====" + "\n");

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                System.out.println("=== Your keep items: " + Arrays.toString(items) + "====" + "\n");
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                //  tracker.update(item);
                System.out.print("=== Item " + name + "is succeed updated !====" + "\n");
            } else if (select == 3) {
                System.out.print("=== Delete item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                //tracker.delete(item);
                System.out.print("=== Item " + item.getName() + "is succeed deleted !====" + "\n");
            } else if (select == 4) {
                System.out.print("=== Find item by Id ====");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.print("=== Fined item  is: // " + item.getName() + "//====" + "\n");
            } else if (select == 5) {
                System.out.print("=== Find item by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                System.out.print("=== Found items : // " + items + "//====" + "\n");
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        StringBuilder builder = new StringBuilder();
        System.out.println("Menu.");
        builder.append("0. Add new Item" + "\n");
        builder.append("1. Show all items" + "\n");
        builder.append("2. Edit item" + "\n");
        builder.append("3. Delete item" + "\n");
        builder.append("4. Find item by Id" + "\n");
        builder.append("5. Find items by name" + "\n");
        builder.append("6. Exit Program" + "\n");
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
