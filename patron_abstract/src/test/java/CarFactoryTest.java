import junit.framework.TestCase;
import org.junit.Test;

public class CarFactoryTest extends TestCase {

    @Test
    public void testCreateVehicle() {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        assertNotNull(car);
        assertTrue(car instanceof Car);
    }
}