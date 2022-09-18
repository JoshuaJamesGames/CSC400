/*
Exercise #4
The factorial of a positive integer n —which we denote as n!—is the product 
of n and the factorial of n − 1. The factorial of 0 is 1. Write two different 
recursive methods that each return the factorial of n.

Exercise #5
Write a recursive method that displays a portion of a given array backward. 
Consider the last entry in the portion first.

*/


public class CSC400_CT5 {
    public static void main(String[] args) {

        System.out.print("The factorial of 5 using factorial() is: ");
        System.out.println(Exercises.factorial(5));

        System.out.print("The factorial of 5 using reverseFactorial() is: ");
        System.out.println(Exercises.reverseFactorial(5));

        //Create a testString for a Char[]
        String testString = "This is a Test";

        //Process the end index and display the front portion of
        Exercises.displayPortion(testString.toCharArray(), 4, 6);

        System.out.println();
        
    }
}
