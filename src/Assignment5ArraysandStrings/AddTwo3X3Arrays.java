package Assignment5ArraysandStrings;

public class AddTwo3X3Arrays {
    public static void main (String[] args){

        int[][] array1 ={{54,12,4}, {2,36,40},{6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6,}, {3,5,12}};

        int[][] sumArray = new int[3][3];

        for(int i=0; i< array1.length;i++){
            for(int j=0; j<array2.length;j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Sum of the arrays:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
