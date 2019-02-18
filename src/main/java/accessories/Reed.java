package accessories;

import accessories.Accessories;

public class Reed extends Accessories {

    private String type;
    private int number;

    public Reed(String make, String name, String type, int number) {
        super(make, name);
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }
}
