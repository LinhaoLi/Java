import java.util.Scanner;

public class q7p3{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("I will calculate your ages for you");
        System.out.println("Enter your birth year on one line");
        int n1,i;
        Scanner keyboard = new Scanner(System.in);
        //Can I change the name of keyboard
        n1 = keyboard.nextInt();
        i = 1;
        while(i<99){
            System.out.println("Your" + i + "th birthday is on" + (n1+i));
            i++;
        }
        keyboard.close();//Why do i need this?
    }
}
