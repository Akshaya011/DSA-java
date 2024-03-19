import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;
public class InputArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 93;
        // arr[1] = 54;
        // arr[2] = 26;
        // arr[3] = 63;
        // arr[4] = 3;
        // System.out.println(arr[3]);
        // System.out.print("ENTER Elements: ");
        // for(int i = 0; i< arr.length;i++){
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // for(int i = 0; i< arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }

        //           ------->arrays of objects
        System.out.print("enter strings: ");
        String[] str = new String[4];
        for(int i =0; i<str.length;i++){
            str[i] = in.next();
        }
        str[1] = "kunal";
            System.out.println(Arrays.toString(str));
            List<Integer>  ans=new ArrayList<>();
    }
}