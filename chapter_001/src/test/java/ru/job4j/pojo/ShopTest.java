package ru.job4j.pojo;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void whenDeleteElementWithIndex0HaveBreadEggBearNull() {
        Product[] products = new Product[4];
        Product prod1 = products[0] = new Product("Milk", 10);
        Product prod2 = products[1] = new Product("Bread", 4);
        Product prod3 = products[2] = new Product("Egg", 19);
        Product prod4 = products[3] = new Product("Bear", 30);
        Product[] etalon = {prod2, prod3, prod4, null};
        System.out.println("Before :" + Arrays.toString(products));
        Product[] result = Shop.delete(products, 0);
        System.out.println("After :" + Arrays.toString(result));
        System.out.println();
        assertThat(Arrays.equals(result, etalon), is(true));
    }

    @Test
    public void whenDeleteElementWithIndex3HaveMilkBreadEggBearNull() {
        Product[] products = new Product[4];
        Product prod1 = products[0] = new Product("Milk", 10);
        Product prod2 = products[1] = new Product("Bread", 4);
        Product prod3 = products[2] = new Product("Egg", 19);
        Product prod4 = products[3] = new Product("Bear", 30);
        System.out.println("Before :" + Arrays.toString(products));
        Product[] result = Shop.delete(products, 3);
        System.out.println("After :" + Arrays.toString(result));
        System.out.println();
        Product[] etalon = {prod1, prod2, prod3, null};
        assertThat(Arrays.equals(result, etalon), is(true));
    }

    @Test
    public void whenDeleteElementWithIndex2HaveMilkBreadBearNullNull() {
        Product[] products = new Product[4];
        Product prod1 = products[0] = new Product("Milk", 10);
        Product prod2 = products[1] = new Product("Bread", 4);
        Product prod3 = products[2] = new Product("Egg", 19);
        Product prod4 = products[3] = new Product("Bear", 30);
        Product[] etalon = {prod1, prod2, prod4, null};
        System.out.println("Before :" + Arrays.toString(products));
        Product[] result = Shop.delete(products, 2);
        System.out.println("After :" + Arrays.toString(result));
        System.out.println();
        assertThat(Arrays.equals(result, etalon), is(true));
    }
}
