import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {

    Saxophone saxophone;


    @Before
    public void setUp() {
        saxophone = new Saxophone("Tenor instruments.Saxophone", "Yamaha", "YTS62 Professional", "gold lacquer", "woodwind", "Bb", 23);
    }

    @Test
    public void canGetKey() {
        assertEquals("Bb", saxophone.getKey());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(23, saxophone.getKeys());
    }

    @Test
    public void canPlaySax() {
        assertEquals("Tenor instruments.Saxophone playing", saxophone.play("Tenor instruments.Saxophone"));
    }
}
