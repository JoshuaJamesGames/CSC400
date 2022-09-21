import java.util.ArrayList;

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

        //An Array of Char
        char[] testChar = new char[]{'a','b','c','d','e'};
        char[] testCharFalse = new char[]{'a','b','c','e','d'};
        System.out.println("{a, b, c, d, e} is sorted: "+ Sorted.ascending(testChar));
        System.out.println("{a, b, c, e, d} is sorted: "+ Sorted.ascending(testCharFalse));
        
        //An Array of Int
        int[] testInt = new int[] {1,2,3,4,5};
        int[] testIntFalse = new int[] {1,2,3,5,4};
        System.out.println("{1, 2, 3, 4, 5} is sorted: "+Sorted.ascending(testInt));
        System.out.println("{1, 2, 3, 5, 4} is sorted: "+Sorted.ascending(testIntFalse));

        //An ArrayList
        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        for(int index = 1; index < 6; index++){
            testArrayList.add(index);
        }
        ArrayList<Integer> testArrayListFalse = new ArrayList<Integer>();
        for(int index = 5; index >= 1; index--){
            testArrayListFalse.add(index);
        }        
        System.out.println("ArrayList {1, 2, 3, 4, 5} is sorted: "+Sorted.ascending(testArrayList));        
        System.out.println("ArrayListFalse {5, 4, 3, 2, 1} is sorted: "+Sorted.ascending(testArrayListFalse));

        //An array of Orders
        Order[] orders = new Order[3];
        orders[0] = new Order("Thompson", 1, 1.99);
        orders[1] = new Order("Smith", 2, 3.50);
        orders[2] = new Order("Zachary", 3, 15.99);
        System.out.println("Orders {Thompson, Smith, Zachary} is in Name order: "+ Sorted.ascending(orders, new Order.Sortbyname()));
        System.out.println("Orders {1, 2, 3} is in Order # order: "+ Sorted.ascending(orders, new Order.SortByOrder()));

        //Comparable Order - Cost basis
        System.out.println("Order {1.99, 3.50, 15.00} is in Cost order: "+ Sorted.ascending(orders));

        //Create an ArrayList of Order Class
        ArrayList<Order> testOrderArrayList = new ArrayList<Order>();        
        testOrderArrayList.add(new Order("Thompson", 1, 1.99));
        testOrderArrayList.add(new Order("Smith", 2, 3.50));
        testOrderArrayList.add(new Order("Zachary", 3, 15.99));
        System.out.println("ArrayList of Orders {1.99, 3.50, 15.00} is in Cost order: "+ Sorted.ascending(testOrderArrayList));
        //Add an order with an out-of-order cost.
        testOrderArrayList.add(new Order("Fellows", 4, 12.49));
        System.out.println("ArrayList of Orders {1.99, 3.50, 15.00, 12.49} is in Cost order: "+ Sorted.ascending(testOrderArrayList));




    }

}
