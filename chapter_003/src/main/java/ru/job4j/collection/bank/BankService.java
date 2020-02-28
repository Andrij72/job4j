package ru.job4j.collection.bank;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Andrew Kulynych
 * @since 1.0
 */
public class BankService {
    static final Account ACCOUNT_STUB = new Account("", 0);
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * This method add new user in array.
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

    public User findByPassport(String passport) {
        Map<User, List<Account>> map = new HashMap<>();
        return users.entrySet().stream()
                .filter(entry -> entry.getKey().getPassport().equals(passport))
                .findFirst().orElseThrow().getKey();
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
