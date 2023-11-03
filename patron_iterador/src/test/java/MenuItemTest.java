import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuItemTest {

    private MenuItem mi;
    @Before
    public void setUp() throws Exception {
        mi = new MenuItem();
    }

    @Test
    public void getDescription() {
        mi = new MenuItem("K&B´s Pancake Breakfast",
                "   Pancakes    with scrambled eggs, and toast ",
                false,
                2.99);

        String esperado = "pancakes with scrambled eggs, and toast";
        String obtenido = mi.getDescription().toLowerCase();
        assertEquals(esperado,obtenido);
    }
}