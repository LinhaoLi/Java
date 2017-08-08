public class ex2{
    public static void main(String[] args){

      for(int i = 1; i<=1000; i++)
          Isprime(i);
    }

    public static void Isprime(int num){
      if (num <= 1){
        return;
      }
      else{
          for(int i = 2; i < Math.sqrt((double)num); i++ ){

              if(num%i == 0){
                  return;
              }
          }
          System.out.println(num);
          return;
      }
    }
}
