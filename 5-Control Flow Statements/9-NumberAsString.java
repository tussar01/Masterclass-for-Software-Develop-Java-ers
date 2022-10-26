

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2022";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}


/*
OUTPUT:
numberAsString= 2022
number = 2022
numberAsString = 20221
number = 2023
*/
