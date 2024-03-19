import java.util.Scanner;

public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        {
            a = 98;
            int c = 90;
            // values initialised in this block will remain in block
        }
        System.out.println(a);
        // System.out.println(c);

}
}