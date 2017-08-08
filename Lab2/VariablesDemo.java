public class VariablesDemo{
    public static void main(String[] args){
      int x;
      double y;

      x = 2;

      System.out.println("x equals " + x);

      x += 3;

      System.out.println("x equals " + x);

      //y = (double)1/x - 1;
      y = (1/(double)x) - 1;

      System.out.println("y equals " + y);

      x = (int)(150 * y);

      System.out.println("x equals " + x);

      y += x;

      System.out.println("y equals " + y);

    }
}
