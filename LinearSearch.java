import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int[] nums = { 23, 12, 4, 2, 1, 3, 45, 323, 34, -1, 90, 89, 100 };
        int target = 150;
        int ans = LinearSearch2(nums, target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]  == target){
                return index;
            }
        }
        return -1;
    }
    static int LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]  == target){
                return arr[index];
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean LinearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]  == target){
                return true;
            }
        }
        return false;
    }
}
