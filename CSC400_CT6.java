/*
From Chapter 15 of Carrano & Henry, 2019, p. 458

Exercise 11. 

Devise an algorithm that detects whether a given array is sorted into
ascending order. Write a Java method that implements your algorithm. 
You can use your method to test whether a sort method has executed correctly.
*/

public class CSC400_CT6 {
    public static void main(String[] args) {
        //Create several array test cases to use with Sorted.ascending()

        char[] testChar = new char[]{'a','b','c','d','e'};
        char[] testCharFalse = new char[]{'a','b','c','e','d'};
        System.out.println("{a, b, c, d, e} is sorted: "+ Sorted.ascending(testChar));
        System.out.println("{a, b, c, e, d} is sorted: "+ Sorted.ascending(testCharFalse));
        
        int[] testInt = new int[] {1,2,3,4,5};
        int[] testIntFalse = new int[] {1,2,3,5,4};
        System.out.println("{1, 2, 3, 4, 5} is sorted: "+Sorted.ascending(testInt));
        System.out.println("{1, 2, 3, 5, 4} is sorted: "+Sorted.ascending(testIntFalse));

        

    }

}
