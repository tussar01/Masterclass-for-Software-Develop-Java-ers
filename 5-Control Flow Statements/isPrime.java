/* 
1. Create a for statement using any range of numbers
2. Determine if the number is a prime number using the isPrime method
3. if it is a prime number, print it out AND increment a count of the number of prime numbers found
4. if that count is 3 exit the for loop
*/

public class Main {
    public static void main(String[] args) {

        int count = 0;
        for(int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count==10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
  
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
//        for(int i=2; i <= n/2; i++){
//            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}


/*
Output:

Number 11 is a prime number
Number 13 is a prime number
Number 17 is a prime number
Number 19 is a prime number
Number 23 is a prime number
Number 29 is a prime number
Number 31 is a prime number
Number 37 is a prime number
Number 41 is a prime number
Number 43 is a prime number
Exiting for loop

*/
