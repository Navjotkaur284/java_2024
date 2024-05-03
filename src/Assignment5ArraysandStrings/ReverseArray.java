package Assignment5ArraysandStrings;

public class ReverseArray {
    public static void main (String[] args) {

        int[] arr = {10,30,43,54,23,543,43,32};
        arrayReverse(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrayReverse(int[] arr){
        int start = 0;
        int end= arr.length-1;
        int temp;

        while( start < end)
        {
            temp =arr[end];
            arr[end]= arr[start];
            arr[start] = temp;
            start ++;
            end --;
        }

    }
}
