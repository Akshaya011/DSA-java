import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // if(fruit.equals("mango")) {
        //     System.out.println("king of fruit");
        // }
        // if(fruit.equals("apple")) {
        //     System.out.println("a sweet red fruit");
        // }

        //String fruit = in.next();
        // switch (fruit) {
        //     case "mango":
        //     System.out.println("king of fruits");
        //     break;
        //     case "apple":
        //     System.out.println("a sweet red fruit");
        //     break;
        //     case "orange":
        //     System.out.println("Round fruit");
        //     break;
        //     case "grapes":
        //     System.out.println("small fruit");
        //     break;
        //     default:
        //     System.out.println("please enter a valid fruit");
        //}

            System.out.print("Enter any number between 1 to 7:");
            int day = in.nextInt();
        switch (day) {
            // case 1 -> System.out.println("Monday");
            // case 2 -> System.out.println("Tuesday");
            // case 3 -> System.out.println("Wednesday");
            // case 4 -> System.out.println("Thursday");
            // case 5 -> System.out.println("Friday");
            // case 6 -> System.out.println("SAturday");
            // case 7 -> System.out.println("Sunday");
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("SAturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
    }
}