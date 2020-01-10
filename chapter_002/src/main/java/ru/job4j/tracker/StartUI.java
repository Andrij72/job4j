package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("You succeed add item <<" + name + ">>");
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println("Your keep item:  {" + item.getName() + "|" + item.getId() + " }");
            }
        }
        System.out.println("Your keep items: " + items.length);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id : ");
        String name = input.askStr("Enter name : ");
        Item bug = new Item(name);
        if (tracker.replace(id, bug)) {
            System.out.println("Item with is succeed updated with new name:  " + name + " !");
        } else {
            System.out.println("Item ==" + name + " | " + id + "== NOT updated , enter corrected id!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id : ");
        if (tracker.delete(id)) {
            System.out.println("Item with " + id + "== is succeed deleted !");
        } else {
            System.out.println("Item with ==" + id + "== NOT deleted,  enter corrected id!");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("=== Find item  is: // " + item.getName() + " //====");
        } else {
            System.out.println("Item with Id " + id + " is't found");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        int count = 0;
        for (Item item : items) {
            count++;
        }
        System.out.println(" Found " + count + " items  <<" + name + ">> .");
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = input.askInt("");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
                System.out.println("Program is closed !");
            }
        }
    }

    public void showMenu() {
        StringBuilder builder = new StringBuilder();
        System.out.println("Menu.");
        builder.append("0. Add new Item" + System.lineSeparator());
        builder.append("1. Show all items" + System.lineSeparator());
        builder.append("2. Edit item" + System.lineSeparator());
        builder.append("3. Delete item" + System.lineSeparator());
        builder.append("4. Find item by Id" + System.lineSeparator());
        builder.append("5. Find items by name" + System.lineSeparator());
        builder.append("6. Exit Program" + System.lineSeparator());
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
