package Assignment1;

import java.util.Scanner;

public class TrafficLightsSignal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter colors red, yellow or green: ");
        String color = scanner.nextLine().toLowerCase();
          String action;

        switch(color) {
            case "red":
                action = "Stop";
                break;
            case "yellow":
                action = "Prepare to stop";
                break;
            case "green":
              action = "Go";
                break;
            default:
                action = "Invalid color";
                break;
        }
        System.out.println("Action: " + action);
    }
}
