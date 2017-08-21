import java.util.Scanner;

public class q4{
    public int count = 0;
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        for(int i = 0;i<3;i++){
        if(!isNegative()){
            System.out.println("The size is "+ count);
            return;
            }
        }
    }
    public boolean isNegative(){
        int n = keyboard.nextInt();
        if(num<0){
            return false;
        }
        else{
            return true;
        }
    }
}
