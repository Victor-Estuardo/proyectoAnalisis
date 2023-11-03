import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MallarDuckTest {
    private Duck d1;
    private ByteArrayOutputStream out;
    public MallarDuckTest() {

    }

    @Before
    public void before() {
        d1 = new MallarDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


    }

    @Test
    public void testToString(){
        String esperado ="mallarduck{}";
        String obtenido = d1.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }

    @Test
    public void TestSwim() {
        d1.swim();
        assertTrue(out.toString().toLowerCase().contains("estoy nadando"));
    }

    @Test
    public void testPerformFly() {

        d1.perfomFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando...."));
    }


    @Test
    public void testDisplay() {
        d1.display();
        assertTrue(out.toString().toLowerCase().contains("hola soy pato silvestre"));
    }

    @Test
    public void testPerformSound() {
        d1.perfomSound();
        assertTrue(out.toString().toLowerCase().contains("quack"));


    }





}