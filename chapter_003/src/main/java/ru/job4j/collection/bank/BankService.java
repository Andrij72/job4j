package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        new ArrayList<Account>();
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }
    }

    public void addAccount(String passport, Account account) {
        User userFd = findByPassport(passport);
        if (userFd != null) {
            for (User userKey : users.keySet()) {
                if (userKey.equals(userFd)) {
                    users.get(userKey).add(account);
                    break;
                }
            }
        }
        //users.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
    }

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
        Account accountFd = null;
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                for (Account a : entry.getValue()) {
                    if (a.getRequisite().equals(requisite)) {
                        accountFd = a;
                        break;
                    }
                }
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

        if (srcAccount != null && (srcAccount.getBalance() >= amount)) {
            double balance = destAccount.getBalance();
            destAccount.setBalance(balance + amount);
            rsl = true;
        }
        return rsl;
    }
}
