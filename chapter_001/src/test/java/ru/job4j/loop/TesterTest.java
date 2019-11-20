package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TesterTest {
        @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {
            int result = new Tester().add(1, 10);
            int expected = 30;
            assertThat(result,is(expected));
        }
    }
