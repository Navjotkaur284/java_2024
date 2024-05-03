package Assignment5ArraysandStrings;

import java.util.Scanner;

public class CountVowelsandConsonant {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0;
        int consonant = 0;

        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
            System.out.println("No. of Vowels:" + vowels );
            System.out.println("No. of Consonant:" + consonant );

    }
}
