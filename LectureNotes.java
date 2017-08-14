//Debug
public class LectureNotes{
    public static void main(String[] args){
//End of Debug
/*L1-2
0. keyboard.nextLine(): Print out whatever sentence you put in
    keyboard.next(): Print out whatever word you put in
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
    import java.util.Scanner;   first remember java.util.scanner, then j is not capital character

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
5. System.out.print()        //No '\n'
6. String sentence = keyboard.nextLine();       //This is the way you call functions

L3-4
0. Double.parseDouble: convert string to a double
    Integer.parseInt: convert string to a int. Remember it is Interger with capital letter I not int.
    Variable.charAt(index): convert string to char. index starts from 0
    Variable1.equals(Variable2): String comparison
    Math.pow(number, power): to raise a power.
    Math.PI: 3.1415926....
    Varible.length() :returns a int.
    Varible.equals(another variable) :returns a boolean.
    + operator:. Creates a new String from the concatenation of two existing
    strings.
    Variable.indexOf(char) and length can only be applied to strings.

1. Primitive types: like int char double...They use a fixed amount of memory.
They can be changed with simple math operations like +-*%
    Objects are customized type of variables like String. One object can contain
    many primitive type as well as many other objects.
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

3. Types: primitive + reference
4. The primitive types ,boolean and char are inclusive, are reserved words, but
String is not reserved. You can use it as a variable name or to make your own
type but it is very risky!

Unlike C, Java can initialize the String and then assign it.
    String str;
    str = "I don't know";
    System.out.println(str);



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

Always have this at the begining:
	if (args.length < 1) {
			return;
		}
space devide arguments, if you want to enter a sentence, use "Hello world!"

10. Conversion: double x = Double . parseDouble (arg[0]);
11. Do not use "==" to compare string content. the value of the String variable is a memory address.
Instead, we can use equals() to obtain comparison between the content of strings.
12. float a = 1.2f  "f" here means the data type is float number.
13. Because of the precision issues, you'd better not compare two float numbers.
    If you must, you can use "the difference is smaller than 10^-n)
14. Bit Calculation. int num = 0x01; (We use int to operate bitwise operation)
                    int num2 = 0x03;
                    int ans = num1 & num2;
15. String comparison:

	1:{	//String msg1 = "hello";
		//String msg2 = msg1; //"hello";

        if (msg1 == msg2) {
			System.out.println("Check 1: equal!");
		}

		if (msg1.equals(msg2)) {
			System.out.println("Check 2: equal!");
		}
    }

    It returns both for the new version of java. The reason can be reached by
    comparing the memory location. New version of Java refers to the same location
    if the contents of the string are the same.

    2:
    {
		String msg1 = new String("hello");
		String msg2 = new String("hello");

		//String msg1 = "hello";

		//msg1 = msg1.intern();   //if you do not comment these
		//msg2 = msg2.intern();   //it will return the both

        if (msg1 == msg2) {
            System.out.println("Check 1: equal!");
        }

        if (msg1.equals(msg2)) {
            System.out.println("Check 2: equal!");
        }

        This time, it returns Check2. The address has changed.

16. int: zero devision cannot be operated
    double/float : zero devision is okay.

L5-6
0. Math.abs();
    String = Integer.toString(int); Number to string
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
4. if(Condition){   //condition cannot be 1/0. It must be True/false.

}
5. for(int i;;){
//i only exist within the curly bracket.
}

6. boolean canMakeCake = ( flour >= (1/2) ); // this is not correct, 1/2 will return 0. you should do 1.0/2.0.



7.


L7-8
1. Numerical Array:
    int [] x;       // declare an array of integers of unknown length, the
    //square blanket is BEFORE variable name.
    int y = 15;
    double [] z = new double [y];       // declares and initializes the array z
    //with y doubles (all initially 0)
2. String:
    String [] myStrings = new String [y];       // declares and initializes the
    //array myStrings with an array of Strings, all initially NULL

    OR:
    String myStrings []= new String [y];        // It does not matter whether
    //the square bracket is before variable or after it.

    OR:
    String names [] = new String [] { " Bill ", " Ted", " Larry " };
    // you cannot assign the size here

    OR:
    String names [];  //declare an array of string of unknown length
3.  Variables [ Variables.length - 1] = 'C';    To reach the last element


L9-10
0. double = Math.sqrt(double);
    double = Math . random ();
1. argument: something that is passed to a method
    parameter: something that is used by a method
2. String methods will return a string but not modify the original string.
   StringBuilder is a String that can be modified
3.  {
        String msg = "abc ";
        StringBuilder sb = new StringBuilder ( msg );
        StringBuilder sb2 = sb;

         System .out . println (sb. toString ());
         System .out . println (sb2 . toString ());

         sb. reverse ();

         System .out . println (sb. toString ());
         System .out . println (sb2 . toString ());
     }
     AND
     {
         String msg = " POOL ";
         StringBuilder sb = new StringBuilder ( msg );
         StringBuilder sb2 = sb;

         sb. reverse ();

         sb = new StringBuilder ( msg );

         System .out . println (sb. toString ());
         System .out . println (sb2 . toString ());
    }

4. This piece of code:

    public String[] foo() {

        return "Hello, World!"
    }

    is NOT correct, because the program is looking an array of string not just a string.
5. For a Java program to work, it HAS to have a main method that is marked public
 static void main and MUST accept the arguments String[].

L11-12
1. The optional "finally" block is always executed at the end of the catch region:
after the try block completes successfully, or after a catch block is executed.

try{
	throw new EOFException ("EOFException: whatever");
}

catch(EOFException e){

}

finally{

}

2. reference:
    catch ( NumberFormatException e) {
        System .err . println (" invalid number ");
    }
3. It must be followed by one or more catch blocks in increasing order of
generality: that is, from the most specific to the most general;

4. Methods should declare the exceptions they can throw:
        public void read () throws IOException
        { read data from a file }

N . A unix/linux tool called file can scan the contents of a file and determine its type
	~> file HelloWorld.java
	HelloWorld.java: ASCII C++ program text
	~> file HelloWorld.class
	HelloWorld.class: compiled Java class data, version 50.0 (Java 1.6)
	~> file runButton.png
	runButton.png: PNG image, 30 x 24, 8-bit/color RGBA, non-interlaced

L13-14
0. name.equalsIgnoreCase: String comparison with no difference between upper and lower cases.
1. this:
    inside the object. you can use "this.name" instead of just "name" as instance variable to make things clear.
    But outside the object, you should always have objectName.name.
2. In a method, the parameter name is local to the method.
3. Method parameter conversion: byte -> short -> int -> long -> float -> double
4. you cannot do:
    public void doStuff(int n1,n2)
    you have to seperate them.
5. Information hiding (abstraction): Precondition and Postcondition in comments.
                                    access modifier: private & public
                                    You cannot use the instance variable's "name"
                                    to refer to the variable anywhere outside the class
However, you can change by using the method in the same class.
private instance variable and method can only be accessed in the class defination.

6. Accessors method: Allow user to look at the data in a private instance variable.

public String getName();
{
    return name;
}

7. Mutator method(set method/setters):

public void setPrice(int count, double costForCount)
{
    if ((count <= 0) || (costForCount <= 0))
    {
        System.out.println("Error: Bad parameter in " +
        "setPrice.");
        System.exit(0);
    }
    else
    {
        groupCount = count;
        groupPrice = costForCount;
    }
}

8. Method call method:
    In a class, if a method call another method, the objectName is omitted. like"rename()" or "this.rename()"
    rather than "objectName.rename()"

9. Encapsulation:
    /***/   /* for class interface comments
    //for implementation comments
10. javadoc
11. In UML Class Diagram: A minus sign means the member is private.
                        A plus sign means the member is public.
12. equals defination:
    If you want to compare the content of two different strings: you can define
a equals method in your class:
    public boolean equals(Species otherObject)
    {
        return (this.name.equalsIgnoreCase(otherObject.name)) &&
        (this.population == otherObject.population) &&
        (this.growthRate == otherObject.growthRate);
    }
13. Boolean variable naming: isName or hasName.
14. When defining a constructor for a class, you can use this as a name for
another constructor in the same class. Any call to this must be the first
action taken by the constructor.
    public Pet3(String initialName)
    {
    this(initialName, 0, 0);
15. method call in constructor:
public Pet(String initialName, int initialAge, double initialWeight)
    {
    setPet(initialName, initialAge, initialWeight);
    }
16. Define static variable:
    public static final double FEET_PER_YARD = 3; //this one cannot change value
    private static int numberOfInvocations;     //this one can
17. When you call a static method, you write the class name instead of an object
name.
import java.util.Scanner;

Class of static methods to perform dimension conversions.
public class DimensionConverter
{
    public static final int INCHES_PER_FOOT = 12;
    public static double convertFeetToInches(double feet)
    {
        return feet * INCHES_PER_FOOT;
    }
        public static double convertInchesToFeet(double inches)
    {
        return inches / INCHES_PER_FOOT;
    }
}

Demonstration of using the class DimensionConverter.
public class DimensionConverterDemo{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in inches: ");
        double inches = keyboard.nextDouble();
        double feet = DimensionConverter.convertInchesToFeet(inches);
        System.out.println(inches + " inches = " + feet + " feet.");
        System.out.print("Enter a measurement in feet: ");
        feet = keyboard.nextDouble();
        inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println(feet + " feet = " + inches + " inches.");

    }
}

18. static method cannot call instance variable, nor instance variable. All it can call
    is static members. However, instance variable and method can call static method or variables.
    A static method cannot call a nonstatic method unless it has an object to do so.

19.


*/
//Debug
    }
}
