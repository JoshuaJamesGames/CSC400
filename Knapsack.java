import java.util.ArrayList;

public class Knapsack {
    
    private int size = 0;
    private ArrayList<String> contents;
    private int value = 0;
    private int contentSize = 0;

    Knapsack(int size){
        this.size = size;
    }

    public boolean add(KnapsackItem item){

        if((contentSize + item.size) <= this.size){

            contents.add(item.name);
            value += item.value;
            contentSize += item.size;

            return true;

        }else{
            return false;
        }
        

    }

    public int getSize(){
        return size;
    }

    public String getContents(){
        return contents.toString();
    }

    public int getValue(){
        return value;
    }

    public int getContentSize(){
        return contentSize;
    }
}
