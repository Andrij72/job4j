package ru.job4j.collection.bank;

import java.util.*;

/**
 * @author Andrew Kulynych
 * @since 1.0
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    /**
     * This method add new user in array.
     *
     * @param user
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
        User userF = new User("", "");
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
        Account accountFd = new Account("", 0);
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
        Account accStub = new Account("", 0);
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dstRequisite);
        double srcBalance = srcAccount.getBalance();
        if (srcAccount != accStub && destAccount != accStub && srcBalance >= amount) {
            srcAccount.setBalance(srcBalance - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
