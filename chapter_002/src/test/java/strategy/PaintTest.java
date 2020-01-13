package strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Anrew Kulynych (akulmmm@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("Before test method");
        System.setOut(new PrintStream(out));
    }

    @After
    public void BackOut() {
        System.setOut(this.stdout);
        System.out.println("After test method");
    }

    @Test
    public void WhenDrawTriangle() {
        Paint.draw(new Triangle());
        assertThat(new Triangle().draw(), is(new StringBuilder()
                .append("    +    " + System.lineSeparator())
                .append("  +   +  " + System.lineSeparator())
                .append(" +     + " + System.lineSeparator())
                .append("+  +  +  +")
                .toString()));
    }

    @Test
    public void WhenDrawSquare() {
        assertThat(new Square().draw(), is(new StringBuilder()
                .append("+  +  +  +" + System.lineSeparator())
                .append("+        +" + System.lineSeparator())
                .append("+        +" + System.lineSeparator())
                .append("+  +  +  +")
                .toString()));
    }
}
