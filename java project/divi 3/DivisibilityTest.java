import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean divisibleByAny = false;
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                divisibleByAny = true;
                System.out.println("The number is divisible by " + i);
            }
        }

        if (!divisibleByAny) {
            System.out.println("The number is not divisible by any number from 1 to 9.");
        }

        scanner.close();
    }
}
