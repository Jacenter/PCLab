package pcsystems;

public class Monitor {
    private Resolution resolution;
    private String manufacturer;
    private String model;

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Monitor(Resolution resolution, String manufacturer, String model) {
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    void drawPixel (int x, int y, String color) {
         System.out.println("Drawing pixel at "  + x + "," + y + " in color " + color);

     }
}
C:\Users\Jared\pcsystemslab