package accessories;

import accessories.Accessories;

public class Bow extends Accessories {

    private String type;
    private String material;
    private String fibreType;

    public Bow(String make, String name, String type, String material, String fibreType) {
        super(make, name);
        this.type = type;
        this.material = material;
        this.fibreType = fibreType;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getFibreType() {
        return fibreType;
    }
}
