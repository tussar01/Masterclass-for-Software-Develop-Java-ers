/*
1. Create a method called isEvenNumber that takes a parameter of type int
2. Its purpose is to determine if the argument passed to the method is an even number or not.
3. return true if an even number, otherwise return false.
 */


public class Main {
    public static void main(String[] args) {

        int number = 1;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else
            return false;
    }
}
