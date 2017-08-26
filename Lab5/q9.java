public class q9{

    //a) A method that will accept one number. If the number is odd, the number will be set to zero,
// otherwise the number is left alone.
    public static int oddZero( int number){
        if(number % 2 != 0){
            number = 0;
        }
        return number;
    }

//b) A method that will calculate the square root of an integer, print the square root and then
//return the square root. If the number is negative, an error message is printed and the number
//is returned.

public static double sqRoot( int number){

    if(number < 0){
        System.out.println("Error! negative number is input");
        return number;
    }

    return Math.sqrt(number);
}

//c) A method that accepts an array of numbers and sets the odd numbers to zero. Note: this
//method is destructive; i.e. it will modify the original array.

public static void oddZeroArray( int[] number){

    for(Integer num: number){
        if(num % 2 != 0){
            num = 0;
        }
    }
}

//d) A method that accepts an array of numbers and returns only the even numbers. Note: this
//method is non-destructive; i.e. it will not modify the original array.
//???
public static int[] evenArray( int[] number){

    int array[] = new int[9];
    for(Integer num: number){
        if(num % 2 != 0){
            num = 0;
        }
    }
    return array;
}


}
