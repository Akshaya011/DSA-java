
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(12);
        // list.add(78);
        // list.add(109);
        // list.add(709);
        // list.add(880); 
        // list.add(8340);
        // list.add(1200);
        // System.out.println(list.contains(709));
        // System.out.println(list.set(0, 454));
        // System.out.print(list);
        
System.out.println("ENTER LIST ELEMENTS: ");
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5; i++){
            System.out.println(list.get(i)); //list[index] will not work 
        }
        System.out.println();
        System.out.println(list);
    }
}
