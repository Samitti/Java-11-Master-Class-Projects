import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;// or min = 2147483647; or = Integer.MAX_VALUE;
        int min = 0;// or max = -2147483647; or = Integer.MIN_VALUE;
        boolean first = true;



        while (true) {

            System.out.println("Enter number :");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int nuber = scanner.nextInt();
                if (first) {        //if we use this
                    max = nuber;    // or max = -2147483647;//
                    min = nuber;    //or min = 2147483647;
                    first = false;  // this flag is not needed
                } else {
                    if (nuber >= max) max = nuber;
                    else if (nuber <= min) min = nuber;
                }
            } else {
                System.out.println("Min is " + min + " Max is " + max);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
}
}


