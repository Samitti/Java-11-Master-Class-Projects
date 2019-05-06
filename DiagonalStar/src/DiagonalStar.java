public class DiagonalStar {
    public static void printSquareStar(int number){

        if(number < 5) System.out.println("Invalid Value");
        else{
            int rowCount = 0;
            int colomun = 0;

            for (int i = 1; i <= number; i++){

                for (int j = 1; j <= number ; j++){
                    rowCount ++;

                    if((j == rowCount)||(rowCount == number))
                        System.out.print("*1");
                    if ((j == 1)||(j == number))
                        System.out.print("*2");
                    if (i == j)
                        System.out.print("*3");
                    if(j == (i - (j + 1)))
                        System.out.print("*4");

                }
                System.out.println();
            }
        }

    }
}
