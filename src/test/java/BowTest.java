import accessories.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void setUp()  {
        bow = new Bow("Codabow",  "Revelation",  "Double Bass", "carbon fibre", "horse hair");
    }


    @Test
    public void getType() {
        assertEquals("Double Bass", bow.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("carbon fibre", bow.getMaterial());
    }

    @Test
    public void getFibreType() {
        assertEquals("horse hair", bow.getFibreType());
    }
}
