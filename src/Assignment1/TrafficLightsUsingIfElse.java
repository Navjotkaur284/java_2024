package Assignment1;

import java.util.Scanner;

public class TrafficLightsUsingIfElse {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter red, yellow or green: ");

        String input = scanner.nextLine().toLowerCase();

        if (input.equals("red")) {
            System.out.println("Stop");
        }
        else if (input.equals("yellow"))
        {
            System.out.println("Prepare to stop");
        }
        else if (input.equals("green"))
        {
            System.out.println("Go");
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}
