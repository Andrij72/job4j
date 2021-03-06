package ru.job4j.collection.bank;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "John Silver");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434").getUsername(), is("John Silver"));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150.0));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        bank.addAccount(user.getPassport(), new Account("113", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150);
        bank.findByRequisite("3434", "113");
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(200.0));
    }
}
