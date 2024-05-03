package Assignment5ArraysandStrings;

public class AverageOfArray {
    public static void main (String[] args){

        int[] arr = {10,30,43,54,23,543,43,32};

        int sum = 0;
        double avg;
        for (int i= 0; i < arr.length;i++) {

            sum = sum + arr[i];
        }
        avg = (double) sum / arr.length ;

        System.out.println("Average of all the elements in array: " + avg);

    }
}
