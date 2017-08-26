import java.util.*;

public class q8{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input your word: ");
		String word = keyboard.next();
		int count = 0;
		for(int i = 0; i < word.length()-1; i++){
			char prev = Character.toLowerCase(word.charAt(i));
			if((prev<'a')||(prev>'z')){
				//System.out.println("wrong");
				continue;
			}
			char next = Character.toLowerCase(word.charAt(i+1));
			if(prev == next){
				count ++;
				if(prev == 'a'||prev == 'e'||prev == 'i'||prev == 'o'||prev == 'u'){
					count ++;
				}
			}
			
		}
		System.out.println("double letters: "+count);
	}
}
