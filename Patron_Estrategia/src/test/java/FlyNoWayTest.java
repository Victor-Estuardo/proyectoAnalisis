import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FlyNoWayTest {

    private  iFly ifly;

    private ByteArrayOutputStream out;

    @Before
    public void before() throws Exception {
        ifly = new FlyNoWay();

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

    }

    @Test
    public void fly() {

        ifly.fly();
        assertTrue(out.toString().toLowerCase().contains("no puedo volar") );
    }

    @Test
    public void testToString() {


        String esperado ="flynoway{}";
        String obtenido  = ifly.toString().toLowerCase();

        assertEquals(obtenido,esperado);
    }
}