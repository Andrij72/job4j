package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.collection.ConvertList2Array.*;

@Ignore
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] result = twoArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                5
        );
        int[][] expect = {
                {1, 2, 3, 4, 5},
                {6, 7, 0, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
