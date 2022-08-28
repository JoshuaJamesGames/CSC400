

public class BagDemo {
    //Mainline logic
    public static void main(String[] args) {

        //Create a Shopping cart
        ShoppingCart myCart = new ShoppingCart(10);
        
        //testAddl() adds and removes items from the cart
        testAddl(myCart);

        //displayBag() outputs cart contents
        displayBag(myCart);
    }

    //Required function from the assignment
    //Will add content to the Bag
    public static void testAddl(ShoppingCart myCart){
        
        myCart.add(new MyType(1, "Beans", 2.49));
        myCart.add(new MyType(1, "Rice", 1.99));
        myCart.add(new MyType(1, "Chicken", 6.29));
        myCart.add(new MyType(1,"Sweet-Tarts", .99));
        //Testing remove() even though it is not required by the assignment
        myCart.remove(new MyType(1,"Sweet-Tarts", .99));
    }

    //Required function from the assignment - 
    //Will display the contents of the Bag 
    //leveraging toArray and toString
    public static void displayBag(ShoppingCart myCart){

        MyType[] printArray = myCart.toArray();
        for(int i = 0; i < printArray.length; i++){
            System.out.println(printArray[i]);
        }
    }
}
