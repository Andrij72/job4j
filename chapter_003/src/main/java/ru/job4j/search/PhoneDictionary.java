package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        return persons.stream()
                .filter(n -> n.getName().contains(key) || n.getSurname().contains(key) || n.getAddress().contains(key) || n.getPhone().contains(key))
                .collect(Collectors.toList());
    }
}
