import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Calculate the number of characters in the surname
        int numChars = surname.length();

        // Determine if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Print the results
        System.out.println("The number of characters in your surname is " + numChars + ".");
        System.out.println("Your current age is an " + ageType + " number.");

        // Close the scanner
        scanner.close();
    }
}
