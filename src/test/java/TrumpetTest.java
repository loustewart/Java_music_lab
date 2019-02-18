import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest  {

    Trumpet trumpet;

    @Before
    public void setUp()  {
        trumpet = new Trumpet("instruments.Trumpet", "Besson", "BE110 New Standard", "silver plated", "brass", 3, "Bb" );
    }

    @Test
    public void canGetName() {
        assertEquals("instruments.Trumpet", trumpet.getName());
    }

    @Test
    public void canGetMake() {
        assertEquals("Besson", trumpet.getMake());
    }

        @Test
    public void canGetModel() {
        assertEquals("BE110 New Standard", trumpet.getModel());
    }

        @Test
    public void canGetMaterial() {
        assertEquals("silver plated", trumpet.getMaterial());
    }

        @Test
    public void canGetFamily() {
        assertEquals("brass", trumpet.getFamily());
    }

        @Test
    public void canGetValues() {
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canGetKey() {
        assertEquals("Bb", trumpet.getKey());
    }

    @Test
    public void canPlayTrumpet() {
        assertEquals("instruments.Trumpet playing", trumpet.play("instruments.Trumpet"));
    }
}
