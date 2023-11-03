import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class DuckTest {
    public Duck d1;

    private ByteArrayOutputStream out;

    public DuckTest() {
    }

    public void before(){
        //d1= new Duck();
        out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));
    }


    public void testToString(){
        String esperado ="duck{}";
        String obtenido = d1.toString().toLowerCase();
        assertEquals (esperado, obtenido);
    }


@Test
    public  void TestSwim(){
        d1.swim();
        assertTrue( out.toString().toLowerCase().contains( "estoy nadando") );
}

@Test
    public void testFly(){

        d1.perfomFly();
        assertTrue(out.toString().toLowerCase().contains("estoy volando"));
}


@Test
    public void testDisplay(){
    d1.display();
    assertTrue(out.toString().toLowerCase().contains("hola soy un pato"));

}
}
