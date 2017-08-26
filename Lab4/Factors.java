import java.util.*;

public class Factors{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int number = keyboard.nextInt();
		if(number<=0){
			System.out.println("Error: Negative input");
			System.exit(1);
		}
		else if(number<1){
			System.out.println("“this has no factors of interest. ");
			System.exit(0);
		}
		
		for(int i=1; i <= number; i++){
			if(number%i != 0){
				
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.print("\nAll done.\n");
	}
}
