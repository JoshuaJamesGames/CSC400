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
        //Create an Array of MyType of size Default_Capacity
        myBag = new MyType[Default_Capacity];
        //Set all elements to null
        for(int i=0; i<myBag.length; i++){
            myBag[i]=null;
        }

        this.Default_Capacity = Default_Capacity;
    }
    
    @Override
    public boolean add(Object anEntry) {
        //Look for the first empty spot and fill it, if there are any
        if(!isFull()){
            for(int i = 0; i < myBag.length; i++){
                if(myBag[i] != null){
                    myBag[i]= (MyType) anEntry;
                    numberOfProducts++;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object anEntry) {
        //Iterate through the myBag Array, looking for a match
        for(int i = 0; i < myBag.length; i++){
            if(myBag[i].equals(anEntry)){
                myBag[i]=null;
                numberOfProducts--;
                return true;
            }
        }
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
