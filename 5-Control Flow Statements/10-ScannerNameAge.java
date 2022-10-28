import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of Birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;
            scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}


/*
OUTPUT:
Enter your year of Birth: 1987
Enter your name: Tussar
Your name is Tussar, and you are 35 years old

*/
