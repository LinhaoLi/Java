import java.util.*;

public class q9{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int [] array = new int[20];
		int i = 0;
		while(i<20){
			System.out.println("Input your "+ (i+1) +"th element in the array.");
			int number = keyboard.nextInt();
			
			if(number != -1){
				array[i] = number;
				i++;
			}
		}
		for(Integer name :array){
			System.out.print(name);
		}
		/*
		System.out.print("{");
		for(int j = 0; j<array.length ; j++ ){
			if(j!=19){
				
				System.out.print(array[j]+",");
			}
			else{
				System.out.print(array[j]);
			}
		}
		System.out.println("}");*/
	}
}
