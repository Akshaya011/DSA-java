
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionArray {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][];
        // int[][] arr2D = {
        //         { 1, 2, 3 },
        //         { 4, 5 },
        //         { 6, 7, 8, 9 }
        // };
        // System.out.println(Arrays.toString(arr2D));
        // System.out.println(Arrays.toString(arr2D[2]));

        int[][] arr = new int[3][3];
        // System.out.println(arr.length);// no. of rows
        // for(int i=0;i < arr2D.length;i++){
            // arr2D[i] = in.nextInt();
        // }
        //input
        System.out.println("ENTER ELEMENTS OF THE ARRAY: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //  output
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // output
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }
        
    }
}
