import accessories.ValveOil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValveOilTest {

    ValveOil valveOil;

    @Before
    public void setUp() {
        valveOil = new ValveOil("Denis Wick", "Advanced Formula Valve Oil", 15.0);
    }


    @Test
    public void getVolume() {
        assertEquals(15.0, valveOil.getVolume(), 0.1);
    }

    @Test
    public void canGetMake() {
        assertEquals("Denis Wick", valveOil.getMake());
    }

    @Test
    public void canGetName() {
        assertEquals("Advanced Formula Valve Oil", valveOil.getName());
    }
}
