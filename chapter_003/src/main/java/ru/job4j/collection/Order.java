package ru.job4j.collection;

import java.util.Objects;

public class Order {
    private String name;
    private String number;

    public Order(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{"
                + "name='" + name + '\''
                + ", number='" + number + '\''
                +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;
        return Objects.equals(number, order.number) && Objects.equals(name, order.name);
    }
}
