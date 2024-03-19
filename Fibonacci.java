import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of fibonacci term you want: ");
        int n = sc.nextInt();
        int i=1;
        int x=0,y=1,z=0;
            if(i==1){
                z=1;
            }
        while(i<n){

            z=x+y;
            x=y;
            y=z;
            i++;
        }
        System.out.println(z);
    }
}