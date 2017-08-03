import java.util.Scanner;

public class q7p2{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("I will add two numbers for you");
        System.out.println("Enter two whole numbers on one line");
        int n1,n2,n3;
        Scanner keyboard = new Scanner(System.in);
        //Can I change the name of keyboard
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        System.out.println("The sum of your number is:"+ (n1+n2+n3));
        keyboard.close();//Why do i need this?
    }
}
