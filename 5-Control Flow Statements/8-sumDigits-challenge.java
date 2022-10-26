
/*
1. Write a method with the name sumDigits that has one int parameter called number.
2. if parameter is >=10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
3. The numbers from 0-9 have 1 digit so we don't want ro process them, also we don't want to process negative numbers, so also return -1 for negative numbers.
4. for example calling the method sumDigits(123) should return 8 since 1+2+3 = 8.
5. Calling the method sumDigits(1) should return -1 as per requirements described above.
6. Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 5 is " + sumDigits(5));
        System.out.println("The sum of digits in number 325 is " + sumDigits(325));
    }

    private static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }
        int sum = 0;

        // 125 -> 125 / 10 = 12 ; 12 * 10 -> 120; 125-120 = 5
        while (number > 0) {

            //Extract the least-significant digit
            int digit = number % 10; // loop1: (125 % 10) = 5= digit
                                    // loop2: (12 % 10) = 2 = digit
                                    // loop3: (1 % 10) = 1 = digit

            sum += digit;           // sum = 5 + 2 +1

            //Drop the least-significant digit
            number /= 10;     // loop1: (125 / 10) = 12 = number
                            // loop2: (12 / 10) = 1 = number
                            // loop3: (1 / 10) = 0 = number (while condition false)
        }
        return sum;
    }
}


/*
OUTPUT:
The sum of digits in number 125 is 8
The sum of digits in number -125 is -1
The sum of digits in number 5 is -1
The sum of digits in number 325 is 10

*/
