import java.util.Scanner;

public class q10{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please type your first name: ");
        String n1 = keyboard.next();
        System.out.print("Please type your first name: ");
        String n2 = keyboard.next();

        System.out.print("Your nickname is ");

        for(int i = 0; i<(n1.length()/2);i++){

          char character = n1.charAt(i);
          if(i == 0 && (character>='a'&& character<='z')){

              character += 'A' - 'a';

          }

            System.out.print(n1.charAt(i));
        }
        for(int i = n2.length()/2; i<n2.length();i++){
              System.out.print(n2.charAt(i));
        }

        keyboard.close();
    }
}
