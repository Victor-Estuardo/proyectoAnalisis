import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SqueakTest {

    private iSound isound;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        isound = new Squeak();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void makeSound() {
        isound.makeSound();
        assertTrue(out.toString().toLowerCase().contains("squeak squeak...") );
    }

    @Test
    public void testToString() {
        String esperado ="squeak{}";
        String obtenido  = isound.toString().toLowerCase();
        assertEquals(obtenido,esperado);
    }
}