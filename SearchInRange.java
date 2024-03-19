
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        // int start = 0, end = 3;
        int ans = LinearSearch(arr, target, 0, 6);
        System.out.println("index = " + ans);
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
