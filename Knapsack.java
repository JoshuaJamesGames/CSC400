import java.util.ArrayList;

public class Knapsack {
    
    private int size = 0;
    private ArrayList<KnapsackItem> contents = new ArrayList<KnapsackItem>();
    private int value = 0;
    private int contentSize = 0;

    Knapsack(int size){
        this.size = size;
    }

    public Knapsack add(KnapsackItem item){

        if((this.contentSize + item.size) <= this.size){

            contents.add(item);
            value += item.value;
            contentSize += item.size;

            //Return a new Knapsack with the item to avoid a reference copy
            Knapsack knapsackWithItem = new Knapsack(this.size);
            knapsackWithItem.setContents(this.contents);
            knapsackWithItem.setSize(this.size);
            knapsackWithItem.setValue(this.value);
            knapsackWithItem.setContentSize(this.contentSize);

            return knapsackWithItem;

        }else{
            return null;
        }
        

    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getContents(){
        return contents.toString();
    }

    public void setContents(ArrayList<KnapsackItem> contents){
        this.contents.clear();
        for(int i = 0; i < contents.size(); i++){
            this.contents.add(contents.get(i));
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getContentSize(){
        return contentSize;
    }

    public void setContentSize(int contentSize){
        this.contentSize = contentSize;
    }
}
