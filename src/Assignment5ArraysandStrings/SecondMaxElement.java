package Assignment5ArraysandStrings;

public class SecondMaxElement {
    public static void main (String[] args){

        int[] arr = {10,30,43,54,23,543,43,32};
        int max= arr[0];
        int secmax = arr[0];

        for(int i=1; i< arr.length; i++) {
            if (arr[i] > max){
                secmax = max;
                max = arr[i];}
            else if (arr[i] > secmax)
                secmax = arr[i];
        }
        System.out.println("Second max element of array:" + secmax);


    }
}
