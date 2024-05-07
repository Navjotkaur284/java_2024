package ExceptionHandling;
import java.util.Scanner;

// Custom exception class for invalid age
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

 class DrivingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Congratulations! You are eligible to take the driving test.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        final int MIN_AGE = 18;
        final int MAX_AGE = 100;

        if (age < MIN_AGE || age > MAX_AGE) {
            throw new InvalidAgeException("Your age is invalid for driving test application.");
        }
    }
}