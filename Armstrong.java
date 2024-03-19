import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number n: ");
    int n = sc.nextInt();
    boolean ans = isArmstrong(n);
    System.out.println(ans);

}
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0; 
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
            if(sum == original){
            return true;
        }
            return false;
        }
    }
}
