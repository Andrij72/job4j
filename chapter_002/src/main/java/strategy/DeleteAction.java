package strategy;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

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
}
