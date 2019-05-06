import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double sum = 0;
        long avaerage = 0;



        while (true) {

           // System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter++;

                sum += scanner.nextInt();

                avaerage = Math.round(sum / counter);


            } else {

                System.out.println("SUM = " + Math.round(sum) + " AVG = " + avaerage);
                break;
            }

            scanner.nextLine();


        }
        scanner.close();
    }
}
