

public class BagDemo {
    public static void main(String[] args) {

        //Create a Shopping cart
        ShoppingCart myCart = new ShoppingCart(10);
        
        //testAddl()
        testAddl(myCart);

        //displayBag()
        displayBag(myCart);
    }

    //Required function from the assignment
    //Will add content to the Bag
    public static void testAddl(ShoppingCart myCart){
        myCart.add(new MyType(1, "Beans", 2.00));
    }

    //Required function from the assignment - 
    //Will display the contents of the Bag 
    //leveraging toArray and toString
    public static void displayBag(ShoppingCart myCart){

    }
}
