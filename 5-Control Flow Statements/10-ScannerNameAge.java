

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of Birth: ");
        int yearOfBirth = scanner.nextInt();
        int age = 2022 - yearOfBirth;
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + ", and you are " + age + " years old");

        scanner.close();
    }
}


/*
OUTPUT:
Enter your year of Birth: 1987
Enter your name: Tussar
Your name is Tussar, and you are 35 years old

*/
