public class Printer {
    private int tonerLevel = 100;
    private int numbePages = 0;
    private int pagesToPrint;
    private boolean dublicatePrinter;

    public Printer(int pagesToPrint, boolean dublicatePrinter) {
        this.pagesToPrint = pagesToPrint;
        this.dublicatePrinter = dublicatePrinter;
    }

    public void fillToner(int tonerLevel) {

        if ((tonerLevel + this.tonerLevel) > 100) {
            this.tonerLevel = 100;
        } else {

            this.tonerLevel += tonerLevel;
        }
    }

    public void print() {

        if (tonerLevel > 0) {

            while (numbePages < pagesToPrint) {

                if (dublicatePrinter) {
                    numbePages++;
                    System.out.println("Dublicate Printing Page " + numbePages);
                } else {
                    numbePages++;
                    System.out.println("Not Dublicate Printing Page " + numbePages);
                }
            }
        } else {

            System.out.println("Tonner empty ");
        }

    }
}
