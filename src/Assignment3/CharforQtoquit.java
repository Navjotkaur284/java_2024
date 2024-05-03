package Assignment3;

import java.util.Scanner;

public class CharforQtoquit {

        public static void  main    (String[] args) {
            char c;

            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Ch");

                c = scanner.next().charAt(0);
            } while ((c != 'q') || (c != 'Q'));
        }
}

