import java.util.Scanner;

public class q9{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please type your first name: ");
        String n1 = keyboard.next();
        System.out.print("Please type your first name: ");
        String n2 = keyboard.next();
        System.out.print("Your name is "+ n1 + " " + n2);
        keyboard.close();
    }
}
