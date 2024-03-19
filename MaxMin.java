

public class MaxMin {
   public static void main(String[] args) {
    int arr[] = {1, 3,16, 23, 9, 18};
    System.out.println(max(arr));
    System.out.println(min(arr));
    System.out.println(maxRange(arr, 0, 2));
}    
static int max(int[] arr) {
    int max = arr[0];
    for(int i =1;i<arr.length;i++){
    if(max < arr[i]){
        max = arr[i];
    }
}
return max;
 }
static int min(int[] arr) {
    int min = arr[0];
    for(int i =1;i<arr.length;i++){
    if(min > arr[i]){
        min = arr[i];
    }
}
    return min;
 }
        static int maxRange(int[] arr, int start, int end){
            if(end > start){
                return -1;
            }
            if(arr == null) {
                return -1;
            }
            int maxval = arr[start];
            for(int i = start; i<=end; i++){
                if(arr[i] > maxval){
                    maxval = arr[i];
                }
            }
            return maxval;
        }
}
