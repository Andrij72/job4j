package strategy;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
       Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println("Your keep item:  {" + item.getName() + "|" + item.getId() + " }");
            }
        }
        System.out.println("Your keep items: " + items.length);
        return true;
    }
}
