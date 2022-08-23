package CSC400;

public class ShoppingCart implements Bag{

    MyType[] myBag;
    int numberOfProducts = 0;
    int Default_Capacity;

    ShoppingCart(){
        //
        myBag = new MyType[1];
        Default_Capacity = 1;
    }

    ShoppingCart(int Default_Capacity){
        //
        myBag = new MyType[Default_Capacity];
        //
        for(int i=0; i<myBag.length; i++){
            myBag[i]=null;
        }

        this.Default_Capacity = Default_Capacity;
    }
    
    @Override
    public boolean add() {
        //
        
        return false;
    }

    @Override
    public boolean remove() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFull() {
        //
        if(numberOfProducts < Default_Capacity){
            return false;
        }else{
            return true;
        }        
    }

    @Override
    public <T> T[] toArray() {
        //
        return null;
    }
    
}
