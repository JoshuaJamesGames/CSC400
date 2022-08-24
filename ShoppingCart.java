
public class ShoppingCart implements Bag{

    MyType[] myBag;
    int numberOfProducts;
    int Default_Capacity;

    ShoppingCart(){
        //Default constructor sets Default_Capacity to 1
        myBag = new MyType[1];
        numberOfProducts = 0;
        Default_Capacity = 1;
    }

    ShoppingCart(int Default_Capacity){
        //Create an Array of MyType of size Default_Capacity
        myBag = new MyType[Default_Capacity];
        numberOfProducts = 0;
        //Set all elements to null
        for(int i=0; i<myBag.length; i++){
            myBag[i]=null;
        }

        this.Default_Capacity = Default_Capacity;
    }
    
    
    public boolean add(Object anEntry) {
        //Look for the first empty spot and fill it, if there are any
        if(!isFull()){
            for(int i = 0; i < myBag.length; i++){
                System.out.println(myBag[i]);
                if(myBag[i] == null){
                    myBag[i]= (MyType) anEntry;
                    numberOfProducts++;
                    return true;                    
                }
            }
        }
        return false;
    }

    
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

    
    public boolean isFull() {
        //
        if(numberOfProducts < Default_Capacity){
            return false;
        }else{
            return true;
        }        
    }

    
    public MyType[] toArray() {
        //Return a Contiguous array of MyType from myBag
        MyType[] returnArray = new MyType[numberOfProducts];
        int returnIndex = 0;
        int myTypeIndex = 0;
        while(myTypeIndex < numberOfProducts){
            if(myBag[myTypeIndex] != null){
                returnArray[returnIndex] = myBag[myTypeIndex];
                returnIndex++;
            }
            myTypeIndex++;
        }
        return returnArray;
    }
    
}
