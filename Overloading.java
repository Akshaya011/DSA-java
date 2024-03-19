public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Akshaya yadav");// at compile time it will decide to run which of the function
        int ans = sum(5, 6, 7); 
        System.out.println(ans);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
