package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {

    @Test
    public void whenConvertTwoListInList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1, 2});
        in.add(new int[]{3, 4, 5});
        List<Integer> result = ConvertList.convert(in);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(result, is(expected));
    }
}