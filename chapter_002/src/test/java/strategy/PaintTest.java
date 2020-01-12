package strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PaintTest {

    @Test
    public void draw() {
        PrintStream stout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint.draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("    +    " + System.lineSeparator())
                .append("  +   +  " + System.lineSeparator())
                .append(" +     + " + System.lineSeparator())
                .append("+  +  +  +" + System.lineSeparator())
                .toString()));
        System.setOut(stout);
    }
}
