package pcsystems;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    void pressPowerButton() {
        System.out.println("Power Button Pressed");
    }
}
