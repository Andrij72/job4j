package ru.job4j.pojo;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void whenDeleteElementWithIndex0After4After2HaveBreadEggNullNullNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Bear", 30);
        System.out.println("Before :" + Arrays.toString(products));
        Shop.delete(products, 0);
        Shop.delete(products, 4);
        Product[] result = Shop.delete(products, 2);
        System.out.println("After :" + Arrays.toString(result));
        assertThat(Arrays.equals(result, products), is(true));
    }
}
