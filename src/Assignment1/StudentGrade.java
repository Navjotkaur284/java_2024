package Assignment1;

import java.util.Scanner;

public class StudentGrade {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Student's Score: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer score.");
            return;
        }

        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid input. Score must be between 0 and 100.");
            return;
        }
        String grade;
        if (score>=90)
        {
            grade ="A";
        }
        else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "E (Fail)";
        }
        System.out.println("The student's grade is: " + grade);
    }
}
