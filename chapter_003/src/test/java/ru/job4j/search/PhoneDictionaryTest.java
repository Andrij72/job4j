package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Andrew", "Kulynych", "4533943", "Minsk"));
        var persons = phones.find("nsk");
        assertThat(persons.get(1).getSurname(), is("Kulynych"));
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
