package ru.job4j.calculator;


import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void womanWeight() {
        int in = 170;
        double out = Fit.womanWeight(in);
        double expected = 69.0;
        int delta = 0;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void manWeight() {
        int in = 170;
        double out = Fit.manWeight(in);
        double expected = 80.5;
        Assert.assertEquals(expected, out, 5);
    }
}
