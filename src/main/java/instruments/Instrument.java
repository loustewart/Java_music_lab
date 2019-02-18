package instruments;

public abstract class Instrument {

    private String name;
    private String make;
    private String model;
    private String material;
    private String family;

    public Instrument(String name, String make, String model, String material, String family) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.material = material;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public String getFamily() {
        return family;
    }
}
