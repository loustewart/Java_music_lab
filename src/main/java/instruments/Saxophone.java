package instruments;

import behaviours.IPlay;
import instruments.Instrument;

public class Saxophone extends Instrument implements IPlay {

    private String key;
    private int keys;

    public Saxophone(String name, String make, String model, String material, String family, String key, int keys) {
        super(name, make, model, material, family);
        this.key = key;
        this.keys = keys;
    }

    public String getKey() {
        return key;
    }

    public int getKeys() {
        return keys;
    }

    public String play(String name) {
        return getName() + " playing";
    }
}
