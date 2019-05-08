public class Main {

    public static void main(String[] args) {
        Dimensions dasDimensions = new Dimensions(20, 20, 5);
        Case dasCase = new Case("2208", "Dell", dasDimensions);
        Monitor dasMonitor = new Monitor("27inch Beast", "Acer",27, new Resolution(2540,1440));
        Motherboard dasMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");

        PC thePC = new PC(dasCase, dasMonitor, dasMotherboard);

        thePC.getTheMonitor().drawPixelAt();
    }

}
