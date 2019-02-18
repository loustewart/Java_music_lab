import instruments.DoubleBass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DoubleBassTest {

    DoubleBass doubleBass;

    @Before
    public void setUp() {
        doubleBass = new DoubleBass("Electric Double Bass", "Stagg", "Electric 3/4 Double Bass", "Metallic Black", "string", 4);
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(4, doubleBass.getStrings());
    }

    @Test
    public void canPlayDoubleBass() {
        assertEquals("Electric Double Bass playing", doubleBass.play("Electric Double Bass"));
    }
}
