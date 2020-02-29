package ru.job4j.collection.bank;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author Andrew Kulynych
 * @since 1.0
 */
public class BankService {
    static final Account ACCOUNT_STUB = new Account("", 0);
    static final User FOUND_USER_STUB = new User("", "");
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * This method add new user .
     *
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

    /**
    *This method  find user by passport
    *@param  passport String type
    * @return object User
    */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(accounts -> accounts.getPassport().equals(passport))
                .findFirst().orElse(FOUND_USER_STUB);
    }

    public Account findByRequisite(String passport, String requisite) {
        User userFd = findByPassport(passport);
        Account accountFd = users.getOrDefault(userFd, new ArrayList<>()).stream()
                .filter(getAccountPredicate(requisite))
                .findFirst()
                .orElse(ACCOUNT_STUB);
        System.out.println(accountFd);
        return accountFd;
    }

    private Predicate<Account> getAccountPredicate(String requisite) {
        return a -> a.getRequisite().equals(requisite);
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
