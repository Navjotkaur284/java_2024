package Assignment5ArraysandStrings;

public class SecondMinElement {
    public static void main (String[] args){

        int[] arr = { 10,30,43,54,23,543,43,32};
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for(int i=0; i< arr.length; i++) {
            if (arr[i] < min){
                secmin = min;
                min = arr[i];
            }
            else if (arr[i] < secmin && arr[i] != min )
                secmin = arr[i];
        }
        System.out.println("Second min element of array: " + secmin);


    }
}
