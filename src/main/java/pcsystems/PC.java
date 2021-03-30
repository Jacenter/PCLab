package pcsystems;

public class PC {

    private Case aCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    //parameterized constructor
    public PC (Case aCase, MotherBoard motherBoard, Monitor monitor) {
        this.aCase = aCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    //drawlogo method
    private void drawLogo() {
        monitor.drawPixel(2,1,"white");
    }

    //description method
    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.printf("%22s-%22s-%22s\n", "Manufacturer", "Model", "Power Supply");
        System.out.printf("%22s-%22s-%22s\n", aCase.getManufacturer(), aCase.getModel(), aCase.getPowerSupply());
        System.out.print("\n");
        System.out.printf("%22s-%22s\n", "Manufacturer", "Model");
        System.out.printf("%22s-%22s\n", monitor.getManufacturer(), monitor.getModel());
        System.out.print("\n");
        System.out.printf("%22s-%22s-%22s-%22s-%22s\n", "Manufacturer", "Model", "RAM SLOTS", "CARD SLOTS", "BIOS");
        System.out.printf("%22s-%22s-%22s-%22s-%22s\n", motherBoard.getManufacturer(), motherBoard.getModel(), motherBoard.getRamSlots(), motherBoard.getCardSlots(), motherBoard.getBios());
    }

    public void powerUp() {
        aCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("NeverWinter Knights");
    }
}

