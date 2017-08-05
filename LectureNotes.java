//Debug
public class LectureNotes{
    public static void main(String[] args){
//End of Debug
/*L1-2
1. Variable names cannot begin with numbers
2. println has built in "\n" at the end of string

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

3. javac HelloWorld.java  this one has ".java" in the end
    java HelloWorld     this one specify java at the beginning
4. Scanner:
    import java.util.Scanner;   first remeber java.util.scanner

    public class Echo {
        public static void main (String[] args) {
        System .out . println (" Enter your data: ");

        Scanner keyboard = new Scanner ( System .in );

        double height = keyboard . nextDouble (); // To get a word, use Variable.nextDouble() function
        String name = keyboard.next();    To get a word, use Variable.next() function
        int age = keyboard.nextInt();       To get a number, use Varible.nextInt()

        System .out . println (" You entered " + height + "m.");
        System .out . println (" You entered " + age + "years old.");
        System .out . println (" You are " + name );
        System .out . println ("If you were 10% bigger you 'd be " 10 + ( height *1.1) + "m.");
        keyboard. close ();     Remember to have this at the end
        }
    }

L3-4
0. Double.parseDouble: convert string to a double
    Integer.parseInt: convert string to a int
    Variable1.equals(Variable2)
    Math.pow(number,power): to raise a power.
    Math.PI: 3.1415926....
    Varible.length() :returns a int.
    Varible.equals(another variable) :returns a boolean.
    + operator:. Creates a new String from the concatenation of two existing strings.

1. Primitive types: like int char double...They use a fixed amount of memory.
They can be changed with simple math operations like +-*%
    Objects are customized type of variables like String. One object can contain many primitive type of
    as well as many other objects.
2. If the variables are declared in BRACES, it ONLY exists within the braces
But the change made on the variables outside the braces will be kept.

int x = 3;
{
    int y = 5; // y is declared here , but z does not exist yet
    int z = y; // y is still fine , and z is now declared too
    x = y; // we 'll copy the value of y into x
 }
// y is no longer defined : it is out of scope
// x now has the value 5

3. types: primitive + reference
4. The primitive types ,boolean and char are inclusive, are reserved words, but
String is not reserved. You can use it as a variable name or to make your own type but it is very risky!
5. The initial value of boolean type is false. You can use & | operations.
The default value of a String is a special value, null
The default value for the integer types char, int, byte, long, byte is 0
6. char type is with single quotes like char ch = 'A'
7. Java does not have unsigned data type.
8.String Documentation:
http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
9. Command line arguments
    public static void main(String[] args){
                                ^ Command line arguments
    }
We can use args[0], args[1].... to use the STRINGS we input. Remember the argument s are always Strings.
They have to be converted into numbers if you want to use them as numbers.
10. Conversion: double x = Double . parseDouble (arg[0]);
11. Do not use "==" to compare string content. the value of the String variable is a memory address.
Instead, we can use equals() to obtain comparison between the content of strings.
12. float a = 1.2f  "f" here means the data type is float number.
13. Because of the precision issues, you'd better not compare two float numbers.


L5-5
1. Cast:
int litres = 4;
int persons = 5;
    double portion = litres / persons ;// This will return 0.0 because litres / persons is 0;
    OR:
    double portion = ( double ) litres / ( double ) persons ;// This will return 0.8 because litres / persons is 0.8.
System.out.println("Portion = "+portion);

2.  double portion = 0.330; // 330 mL
    int litres = 5;
    int persons = (int)(litres / portion) ; //Remember "int" is in the brackets.
    System.out.println("persons = "+persons);
3. while(Condition){

}
4. if(Condition){

}

L7-8
1. Array:
int [] x; // declare an array of integers of unknown length
int y = 15;
double [] z = new double [y];   // declare and initialise an array of doubles
String [] myStrings = new String [y];   // declare and initialise an array of Strings


//Debug
    }
}
