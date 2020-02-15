package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
            String id = input.askStr("Enter Id: ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println("=== Find item  is: // " + item.getName() + " //====");
            } else {
                System.out.println("Item with Id " + id + " is't found");
            }
        return true;
    }

    @Override
    public Object isCall() {
        return null;
    }
}
