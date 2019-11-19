package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest1 {

    @Test
    public void square(){
        int inP = 6;
        int inK = 2;
        double expected = 2.0;
        int delta = 0;
        double out = SqArea1.square(inP, inK);
        Assert.assertEquals(expected, out, delta);
    }
}
