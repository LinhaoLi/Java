public class q3{
	public static final int BUFFSIZE = 99;
	
	public static void main(String[] args){
		for(int i = 1; i<=BUFFSIZE;i++){
			if(i%2!=0){
				System.out.print(i);
				if(i!= BUFFSIZE){
					System.out.print(",");				
				}else{
					System.out.print("\n");	
				}
			}			
		}
	}
}
