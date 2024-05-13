package Assignment1;

import java.util.Scanner;

public class CharVowelConsonant {

        public static void main (String[] args){


            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a char");
            char c = scanner.next().charAt(0);

            if(c=='a' || c =='A' || c=='e'|| c=='E'|| c=='i' || c=='I' || c== 'o'|| c=='O' ||c =='u'|| c=='U')
            {
                System.out.println("Char is vowel");
            }
            else
            {
                System.out.println("Char is consonant");
            }

        }

}
