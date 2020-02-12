package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenMaxIs4From4and3and2and1() {
        int result = SqMax.max(4, 3, 2, 1);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void whenMaxIs5From4and5and2and1() {
        int result = SqMax.max(4, 5, 2, 1);
        Assert.assertThat(result, is(5));

    }

    @Test
    public void whenMaxIs7From4and3and2and7() {
        int result = SqMax.max(4, 3, 2, 7);
        Assert.assertThat(result, is(7));
    }

    @Test
    public void whenMaxIs4From4and4and2and1() {
        int result = SqMax.max(4, 4, 2, 1);
        Assert.assertThat(result, is(4));
    }

    @Test
    public void whenMaxIs3From3and3and3and1() {
        int result = SqMax.max(3, 3, 3, 1);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void whenMaxIs5From5and5and5and5() {
        int result = SqMax.max(5, 5, 5, 5);
        Assert.assertThat(result, is(5));
    }
}
