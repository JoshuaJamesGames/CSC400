public class Knapsack {
    
    private int size = 0;
    private String[] contents;
    private int value = 0;
    private int contentSize = 0;

    Knapsack(int size){
        this.size = size;
    }

    public void add(KnapsackItem item){
        
    }

    public int getSize(){
        return size;
    }

    public String[] getContents(){
        return contents;
    }

    public int getValue(){
        return value;
    }

    public int getContentSize(){
        return contentSize;
    }
}
