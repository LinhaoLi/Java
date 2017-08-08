public class ex1{
    public static void main(String[] args){

        if(args.length<1){
          System.out.println("Not enough input!");
        }

        int num = Integer.parseInt(args[0]);
        if (num <= 1){
          System.out.print("Not prime");
          return;
        }
        else{
            for(int i = 2; i < Math.sqrt((double)num); i++ ){

                if(num%i == 0){
                    System.out.print("Not prime: " + num + " is a factor");
                    return;
                }
            }
            System.out.print(num + " is a factor");
            return;
        }
    }
}
