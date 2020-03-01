package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.lambda.DiapasonFunction.diapason;

public class DiapasonFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = List.of(21D, 25D, 29D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        List<Double> result = diapason(1, 4, x -> Math.pow(x, 2.0) + 1);
        List<Double> expected = List.of(5D, 17D, 37D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunction() {
        List<Double> result = diapason(1, 3, x -> Math.log(x + 3));
        List<Double> expected = List.of(1.6094379124341003D, 1.9459101490553132D);
        assertThat(result, is(expected));
    }
}
