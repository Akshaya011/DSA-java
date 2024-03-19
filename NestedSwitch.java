import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

    switch(empId) {
        case 1:
        System.out.println("kunal kushwaha");
        break;
        case 2:
        System.out.println("Rahul rana");
        break;
        case 3:
        System.out.println("Emp number 3 ");
        switch (department) {
            case "IT":
            System.out.println("IT department");
            break;
            case "management":
            System.out.println("Management department");
            break;
            default:
            System.out.println("No department entered");
        }
        break;
        default:
        System.out.println("Enter correct empID");
    }
}
}