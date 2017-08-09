
public class javatest{

   public static void main(String args[]) {
       try {
    throw new ArithmeticException ("EOFException: whatever");

    }
    catch ( ArithmeticException e) {
    System .out . println (" Oops : " + e);
    }
   }

}
