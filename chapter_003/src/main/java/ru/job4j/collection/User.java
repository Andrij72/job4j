package ru.job4j.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class User implements Comparable<User> {
    private String name;
    private int age;

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User o) {
        int rs = this.name.compareTo(o.name);
        if (rs == 0) {
            rs = Integer.compare(this.age, o.age);
        }
        return rs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Fill", 31));
        users.add(new User("John", 31));
        System.out.println(users);
    }
}
