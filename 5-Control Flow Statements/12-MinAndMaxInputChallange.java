

/*
 ● Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
 ● Before the user enters the number, print the message "Enter number:"
 ● If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

 Hint:
  ●  Use endless while loop.
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;   // min =0
        int max = Integer.MIN_VALUE;   // max =0
//        boolean first = true;

        while(true) {        // infinite loop
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;

            }
            scanner.nextLine();
        }
        System.out.println("min= " + min + ", max= " + max);

        scanner.close();

    }
}

/*
OUTPUT:
Enter number:
2147483645
Enter number:
-2147483633
Enter number:
a
min= -2147483633, max= 2147483645

*/

