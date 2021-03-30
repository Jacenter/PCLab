package pcsystems;

public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(2,4);
        Dimension dimension = new Dimension(10,20,10);
        Case acase = new Case("C","APPLE","Battery",dimension);
        Monitor monitor = new Monitor(resolution,"APPLE", "B");
        MotherBoard motherBoard = new MotherBoard("A","APPLE",2,2,"BIOS");
        PC pc3 = new PC(acase, motherBoard, monitor);

        pc3.description();
        System.out.println();
        pc3.powerUp();
    }
}
