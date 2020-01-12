package strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void drawWhenSquare() {
        assertThat(new Square().draw(), is(new StringBuilder()
                .append("+  +  +  +" + System.lineSeparator())
                .append("+        +" + System.lineSeparator())
                .append("+        +" + System.lineSeparator())
                .append("+  +  +  +")
                .toString()));
    }
}