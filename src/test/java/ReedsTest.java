import accessories.Reed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedsTest {

    Reed reed;

    @Before
    public void setUp() {
        reed = new Reed("Odyssey",  "Premiere 1.5",  "Tenor instruments.Saxophone", 3);
    }

    @Test
    public void canGetType() {
        assertEquals("Tenor instruments.Saxophone", reed.getType());
    }

    @Test
    public void canGetNumber() {
        assertEquals(3, reed.getNumber());
    }
}
