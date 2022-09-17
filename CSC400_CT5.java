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
        //Exercizes homework = new Exercizes();

        System.out.println(Exercizes.factorial(5));

        System.out.println(Exercizes.reverseFactorial(5));

        String testString = "This is a Test";

        Exercizes.displayPortion(testString.toCharArray(), 6);

        System.out.println();
        
    }
}
