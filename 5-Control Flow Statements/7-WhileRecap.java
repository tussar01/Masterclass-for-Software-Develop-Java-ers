
  // 1. We can interrupt the loop by using a "continue" and/or a "break" statement.
 //2. With the "continue" keyword the loop will bypass the part of the code block that is below the "continue" keyword and continue with the next iteration.
//3. With the "break" keyword we can exit the loop depending on the condition that we are checking.


public class Main {
    public static void main(String[] args) {

        int number = 0;
        while (number < 15) {
            number++;

            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("number= " + number);

            if(number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }
}


/*
output :

Skipping number 1
Skipping number 2
Skipping number 3
Skipping number 4
Skipping number 5
number= 6
number= 7
number= 8
number= 9
number= 10
Breaking at 10

*/
