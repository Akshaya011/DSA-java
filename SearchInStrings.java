import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        // Arrays.toString(name.toCharArraay());
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    static int search2(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
    static boolean search3(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        
        return false;
    }
}
