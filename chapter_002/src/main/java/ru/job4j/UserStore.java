package ru.job4j;

import ru.job4j.ex.UserInvalidException;
import ru.job4j.ex.UserNotFoundException;

public class UserStore extends FindEl {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                rsl = users[index];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("The user isn't found!");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("The user is not valid.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Robin Good", true)};
        try {
            User user = findUser(users, "Robin Good");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        }
    }
}
