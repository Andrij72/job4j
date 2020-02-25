package ru.job4j.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Address address = (Address) o;
        if (home != address.home) {
            return false;
        }
        if (apartment != address.apartment) {
            return false;
        }
        if (!city.equals(address.city)) {
            return false;
        }
        return street.equals(address.street);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + home;
        result = 31 * result + apartment;
        return result;
    }

    @Override
    public String toString() {
        return "{" + city + street + home + apartment
                + '}';
    }
}
