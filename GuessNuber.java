   import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){
        //mini-project
        Scanner sc = new Scanner(System.in);
        int mynum =( int) (Math.random()*100);
        int usernum;
        do{
            System.out.println("Guess any number : ");
            usernum = sc.nextInt();
            if(usernum == mynum){
                System.out.println("WOOHOO ..  CORRECT NUMBER!!!");
                gfds
            }
            else if(usernum > mynum){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        }while(usernum >= 0);
    }
}
