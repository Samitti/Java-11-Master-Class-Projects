public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(3,false);

        printer.print();

        printer.fillToner(-100);
        printer.print();


        printer.fillToner(10);
        printer.print();


    }
}
