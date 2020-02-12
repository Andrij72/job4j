package ru.job4j.collection.bank;

import java.util.*;

/**
 * @author Andrew Kulynych
 * @since 1.0
 */
public class BankService {
    static final Account ACCOUNT_STUB = new Account("", 0);
    static final User FOUND_USER_STUB = new User("", "");
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * This method add new user in array.
     * @param user the {User} type
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User userFd = findByPassport(passport);
        List<Account> valueUpd = users.getOrDefault(userFd, new ArrayList<>());
        valueUpd.add(account);
        users.putIfAbsent(userFd, valueUpd);
    }

    public User findByPassport(String passport) {
        User userF = FOUND_USER_STUB;
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                userF = entry.getKey();
                break;
            }
        }
        return userF;
    }

    public Account findByRequisite(String passport, String requisite) {
        User userFd = findByPassport(passport);
        List<Account> value = users.getOrDefault(userFd, new ArrayList<>());
        Account accountFd = ACCOUNT_STUB;
        for (Account a : value) {
            if (a.getRequisite().equals(requisite)) {
                accountFd = a;
                break;
            }
        }
        System.out.println(accountFd);
        return accountFd;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dstRequisite, double amount) {
        boolean rsl = false;

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dstRequisite);
        double srcBalance = srcAccount.getBalance();
        if (!srcAccount.equals(ACCOUNT_STUB) && !destAccount.equals(ACCOUNT_STUB) && srcBalance >= amount) {
            srcAccount.setBalance(srcBalance - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
