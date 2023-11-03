import junit.framework.TestCase;
import org.junit.Test;

public class MotorcycleFactoryTest extends TestCase {
    @Test
    public void testCreateVehicle() {
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        assertNotNull(motorcycle);
        assertTrue(motorcycle instanceof Motorcycle);
    }
}