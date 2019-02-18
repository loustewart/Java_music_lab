package instruments;

import behaviours.IPlay;
import instruments.Instrument;

public class DoubleBass extends Instrument implements IPlay {

    private int strings;

    public DoubleBass(String name, String make, String model, String material, String family, int strings) {
        super(name, make, model, material, family);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public String play(String playing) {
        return getName() + " playing";
    }
}
