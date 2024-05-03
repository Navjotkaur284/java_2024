package Assignment5ArraysandStrings;

public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32 };
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("The minimum element in the array is: " + min);
    }
}
