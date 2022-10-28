
/*
 ● Read 10 numbers from the console entered by the user and print the sum of those numbers.
 ● Create a Scanner like we did in the previous video.
 ● Use hasNextInt() method form the scanner to check if the user has entered an int value.
 ● if hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
 ● Use the nextInt() method to get the number and ass it to sum.
 ● Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1,2,3, etc
 Hint:
 - use a while loop
 - use a counter variable for counting valid numbers
 - Close the scanner after you don't need it anymore
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int sum = 0;

        while(counter < 10) {
//        while(true) {
            int order = counter+1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum +=number;
//                if (counter == 10){
//                    break;
//                }
            } else {
                System.out.println("Invalid Number.");
            }
            scanner.nextLine();
        }
        System.out.println("Sum is " + sum);
        scanner.close();

    }
}


