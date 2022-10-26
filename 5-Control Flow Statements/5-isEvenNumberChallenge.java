/*
1. Create a method called isEvenNumber that takes a parameter of type int
2. Its purpose is to determine if the argument passed to the method is an even number or not.
3. return true if an even number, otherwise return false.
 */
// Modify the while code
// Make it also record the total number of even numbers it has found
// and break once 5 are found
//and at the end, display the total number of even numbers found

public class Main {
    public static void main(String[] args) {
//
//        int number = 4;
//        int finishNumber = 20;

//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
      
        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
          
            evenNumberFound++;
            if(evenNumberFound >=5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else
            return false;
    }
}
