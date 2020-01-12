package strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void drawWhenTriangle() {
        assertThat(new Triangle().draw(), is(new StringBuilder()
                .append("    +    " + System.lineSeparator())
                .append("  +   +  " + System.lineSeparator())
                .append(" +     + " + System.lineSeparator())
                .append("+  +  +  +")
                .toString()));
    }
}