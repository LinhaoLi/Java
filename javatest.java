public class javatest{
//public javatest () { }；
   public static void main(String args[]) {
       javatest chairs = new javatest ();
  chairs . number = 50;
  int value = chairs . number ;

  System .out . println ( " value : " + value );
  System .out . println ( " chairs . number : " + chairs . number );

  chairs . number = 16; // change which part of memory ?

System .out . println ( " value : " + value );
 System .out . println ( " chairs . number : " + chairs . number );
   }

}
