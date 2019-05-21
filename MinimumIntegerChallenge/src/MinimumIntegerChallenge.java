import java.util.Scanner;

public class MinimumIntegerChallenge {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter lenght of Integers: ");
        int count = scanner.nextInt();
        int[] itegerArry = new int[count];
        itegerArry = readIntegers(count);
        int min = findMin(itegerArry);
        System.out.println("The minmum value is: "+ min);

    }

    public static int[] readIntegers(int count){

        System.out.println("Please enter "+count+" Integers: ");
        int[] itegerArry2 = new int[count];
       for (int i = 0; i < itegerArry2.length; i++){

           itegerArry2[i] = scanner.nextInt();

       }

       return itegerArry2;

    }

    public static int findMin(int[] arry){

        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {


            if (arry[i] < min) {
                min = arry[i];

            }

        }
        return min;

    }


}
