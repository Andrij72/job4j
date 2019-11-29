package ru.job4j.arrays;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort1() {
        int[] input = new int[] {3, 11, 2, 22, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 5, 11, 22};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {44, 11, 100, 22, 55, 13, 4, 66, 0};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {0, 4, 11, 13, 22, 44, 55, 66, 100};
        assertThat(result, is(expect));
    }
}
