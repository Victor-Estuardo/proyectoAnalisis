import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MuteTest {

    private iSound isound;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        isound = new Mute();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void makeSound() {
        isound.makeSound();
        assertTrue(out.toString().toLowerCase().contains("no puedo graznar...") );
    }

    @Test
    public void testToString() {
        String esperado ="mute{}";
        String obtenido  = isound.toString().toLowerCase();
        assertEquals(obtenido,esperado);
    }
}