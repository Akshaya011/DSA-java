public class Q5_Even_Digit {
    public static void main(String[] args) {
       int[] arr = {12,2354,1,343,678,8971,-123}; 
       int ans = digits(arr);
       System.out.println(ans);
        int ans2 = findnumbers(arr);
        System.out.println(ans2);
    }
    //1
    static int digits(int[] arr){
        int count = 0;
        int even = 0;

        for (int x : arr) {
            if(x<0){x*=-1;}
            if(x == 0){return 1;}
            count = 0;
            while(x>0){
                x=x/10;
                count++;
            }
            // System.out.println(count);
        if(count % 2 == 0){
            even++;}
        }
        
        return even;
    }
    //2
    static int findnumbers(int[]nums){
        int count = 0; 
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }return count;
    }
static boolean even(int num) {
    int numofdigits = digit(num);
    return numofdigits % 2 ==0;
}
static int digit(int num) {
if(num < 0){
    num *= -1; 
}if(num == 0){
    return 1;
}
    int count = 0;
    while(num > 0) {
        count++;
        num = num/10;
    }
    return count;
}

}
// to count no. of digits we can use [Math.log10(number)+1]
