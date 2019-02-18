package accessories;

public abstract class Accessories {

    private String make;
    private String name;

    public Accessories(String make, String name) {
        this.make = make;
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public String getName() {
        return name;
    }
}
