package accessories ;

public class ValveOil extends Accessories {

    private double volume;

    public ValveOil(String make, String name, double volume) {
        super(make, name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
