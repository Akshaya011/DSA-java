
public class Shadowing {
    static int x = 90;
    public static void main (String[] args) {
        System.out.println(x); //90
        int x;
        x = 40;
        System.out.println(x); //40
        fun(); //90
    }
    static void fun() {
        System.out.println(x);
        
        //shadowing- using two variables within the same name within the scope that overlapse
    }
}
