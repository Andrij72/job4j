package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
            String id = input.askStr("Enter id : ");
            if (tracker.delete(id)) {
                System.out.println("Item with " + id + "== is succeed deleted !");
            } else {
                System.out.println("Item with ==" + id + "== NOT deleted,  enter corrected id!");
            }
        return true;
    }

    @Override
    public Object isCall() {
        return null;
    }
}
