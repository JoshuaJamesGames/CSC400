package CSC400;

public class MyType {

    int customerNumber = 0;
    String itemName = null;
    double price = 0;

    MyType(int customerNumber, String itemName, double price){
        this.customerNumber = customerNumber;
        this.itemName = itemName;
        this.price = price;
    }

    
    @Override
    public String toString() {
        
        return String.format("Customer #%d: %s $%.02f", customerNumber, itemName, price);
    }
}
