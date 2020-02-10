package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        new ArrayList<Account>();
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User userFd = findByPassport(passport);
        List<Account> valueUpd = users.get(userFd);
        valueUpd.add(account);
        users.putIfAbsent(userFd, valueUpd);
    }
    //users.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

    public User findByPassport(String passport) {
        User userF = null;
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
        List<Account> value = users.get(userFd);
        Account accountFd = null;
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
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dеstRequisite);
        double srcBalance = srcAccount.getBalance();
        if (srcAccount != null && destAccount != null && srcBalance >= amount) {
            srcAccount.setBalance(srcBalance - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
