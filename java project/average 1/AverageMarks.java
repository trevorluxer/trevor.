import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the student to enter marks for each unit
        System.out.println("Enter marks for each unit:");

        double totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Unit " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate the average
        double average = totalMarks / 5;

        // Display the average with two decimal places
        System.out.printf("Average marks: %.2f\n", average);

        // Close the scanner
        scanner.close();
    }
}
