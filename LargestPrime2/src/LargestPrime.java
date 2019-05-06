public class LargestPrime {
    public static int getLargestPrime(int number){

        if(number < 2) return -1;

        int temp = -1;

        for (int i = 2; i < number; i++) {

            if ((number % i) == 0) {

                if (isPrime(i)) {
                    temp = i;
                }
            }



        }
        return temp;
        }

        public static boolean isPrime(int n){

            if(n == 1){
                return false;
            }
            for(int i=2; i<= n/2; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }


    }

