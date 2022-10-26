public class Main {

    public static void main(String[] args) {
       int count = 1;
       while (count != 6) {
           System.out.println("Count value is " + count);
           count++;
       }
       int count = 1;
       while (true) {
           if (count == 6) {
               break;
           }
           System.out.println("Count value is " + count);
           count++;
       }

       for (count=1; count !=6; count++) {
           System.out.println("Count value is " + count);
       }

        int count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count !=6);

    }
}

/*
Output is 

Count value is 1
Count value is 2
Count value is 3
Count value is 4
Count value is 5


*/
