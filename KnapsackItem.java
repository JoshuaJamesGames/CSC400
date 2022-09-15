public class KnapsackItem {
    
    int size = 0;
    int value = 0;
    String name = "";
    
    KnapsackItem(int size, int value, String name){

        this.size = size;
        this.value = value;
        this.name = name;
        
    }

    @Override
    public String toString() {
        // 
        return String.format("%s, Size: %d, Value: %d",this.name, this.size, this.value );
    }

}
