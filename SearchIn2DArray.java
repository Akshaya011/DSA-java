import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 4 },
                { 12, 33, 34, 54 },
                { 23, 45, 54, 7856, 5453 },
                { 9, 10 }
        };
        int target = 10;
        int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));
        int max_value = max_2D(arr);
        System.out.println(max_value);
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max_2D(int[][] arr) {
        int max = arr[0][0];
        // int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                    
                }
            }
        }
        return max;
    }
}
