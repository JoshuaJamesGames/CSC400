

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

    @Override
    public boolean equals(Object anObject){
        //Compares a MyType with another Object
        if (anObject == this) {
            return true;
        }

        if (!(anObject instanceof MyType)) {
            return false;
        }
        
        //Cast to MyType - Won't get this far if not compatible
        MyType checkMe = (MyType) anObject;

        //All attributes must match
        return (checkMe.customerNumber == this.customerNumber && 
                checkMe.itemName.equals(this.itemName) && 
                checkMe.price == this.price);
    }
}
