import java.util.*;

public class q3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		while(true){
			System.out.println("Enter a number: ");
			String name =  keyboard.next();
			boolean flag = false;
			if(name.equals("exit")){
				System.out.println("Exiting program.");

				System.exit(0);

			}
			for(String userInput: args){
				 if(userInput.equals(name)){
					 flag = true;
				 }
			}
			if(flag){
				System.out.println("That number is in the array.");
			}else{
				System.out.println("That number is not in the array.");

			}
		}
	}
}
