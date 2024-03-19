
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,56,65,4,34,23,34);
        multiple(2, 3, 56, 78, 67, 89, 45, 44, 98 );
    }
    static void fun (int ...v) { // variable length arguement
        System.out.println(Arrays.toString(v));
    }  
    static void multiple(int a, int b, int ...v) {    //...v should always come to end
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }  
}