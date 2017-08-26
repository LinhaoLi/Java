public class q2{
	public static void main(String[] args){
		int i = 0;
		int intArray[] = new int[args.length];
		for(String userInput: args){
			
			intArray[i] = Integer.parseInt(userInput);
			i++;
		}
		
		
		i = 0;
		for(Integer userInput: intArray){
			
			System.out.println("args["+i+"] = "+ userInput);
			i++;
		}
		
		
	}
}
