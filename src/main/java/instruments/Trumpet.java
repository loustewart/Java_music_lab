package instruments;

import behaviours.IPlay;
import instruments.Instrument;

public class Trumpet extends Instrument implements IPlay {

    private int valves;
    private String key;

    public Trumpet(String name, String make, String model, String material, String family, int valves, String key) {
        super(name, make, model, material, family);
        this.valves = valves;
        this.key = key;
    }

    public int getValves() {
        return valves;
    }

    public String getKey() {
        return key;
    }

    public String play(String playing) {
        return getName() + " playing";
    }
}
