public class Printer {
    private boolean duplex;
    private int tonerLevel;
    private int pagesPrinted;

    public Printer(boolean duplex, int tonerLevel, int pagesPrinted) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
    }

    public void fillToner(){
        this.tonerLevel = 100;
        System.out.println("Toner filled.");
    }

    public void printPage(){
        this.pagesPrinted += 1;
    }

}
