public class q{
    public static void main(String[] args){
        if(arg.length < 1){
            System.out.println("Not enough arguments. ");
        }
        int n = Integer.parseInt(args[0]);
        int m = n;
        double noCast = n/2;
        double cast = ((double)n)/2;
        if(Math.abs(cast) < 0.01){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
}
