import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DecoyDuckTest {
    private Duck d1;
    private ByteArrayOutputStream out;

    @Before
    public void before() {
        d1 = new DecoyDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


    }

    @Test
    public void testToString() {
        String esperado = "decoyduck{}";
        String obtenido = d1.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void TestSwim() {
        d1.swim();
        assertTrue(out.toString().toLowerCase().contains("puedo flotar"));
    }

    @Test
    public void testPerformFly() {

        d1.perfomFly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar"));
    }


    @Test
    public void testDisplay() {
        d1.display();
        assertTrue(out.toString().toLowerCase().contains("soy un pato señuelo"));
    }

    @Test
    public void testPerformSound() {
        d1.perfomSound();
        assertTrue(out.toString().toLowerCase().contains("no puedo graznar..."));
    }
}