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
    compare the memory location. New version of Java refers to the same location
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
1:

*/
//Debug
    }
}
