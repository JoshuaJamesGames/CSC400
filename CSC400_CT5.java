/*
 * Imagine an array of n items from which you can choose. 
 * You will place the items you choose into a knapsack of size k. 
 * Each item has a size and a value. Of course, you cannot take more items 
 * than you have space for in the knapsack. Your goal is to maximize the 
 * total value of the items you take.
 * 
 * Design a recursive algorithm maxKnapsack to solve this knapsack problem. 
 * The parameters to the algorithm are the knapsack, the array of items, and 
 * the position within the array of the next item to consider. 
 * 
 * The algorithm chooses the items for the knapsack and returns a knapsack 
 * containing the chosen items. A knapsack can report its size, its contents, 
 * the value of its contents, and the size of its contents.
 * 
 * Write the classes Knapsack and KnapsackItem . Then write a program that 
 * defines the method maxKnapsack . 
 * 
 * The program should read the size of the knapsack and then the 
 * size, value, and name of each available item.
 */

public class CSC400_CT5 {
    public static void main(String[] args) {

        
        KnapsackItem[] items = new KnapsackItem[6];
        Knapsack sack = new Knapsack(10);
        
        //Sample items from the assignment

        items[0] = new KnapsackItem(1,50000, "rare coin");
        items[1] = new KnapsackItem(2, 7000, "small gold coin");
        items[2] = new KnapsackItem(4, 10000, "packet of stamps");
        items[3] = new KnapsackItem(4, 11000, "pearl necklace");
        items[4] = new KnapsackItem(5, 12000, "silver bar");
        items[5] = new KnapsackItem(10, 60000, "painting");

        

        System.out.println(maxKnapsack(sack, items, 5).getContents());

    }

    public static Knapsack maxKnapsack(Knapsack sack, KnapsackItem[] items, int nextItemPosition){

        KnapsackItem nextItem = items[nextItemPosition];
        
        Knapsack sackWithoutItem = sack;
        sack.add(nextItem);
        Knapsack sackWithItem = sack;

        System.out.println(sackWithItem + "\n" + sackWithoutItem+ "\n");

        //base case: sack is full or cannot contain any more items and all items considered
        if(nextItemPosition == 0){

            maxKnapsack(sack, items, nextItemPosition - 1);

            if(sackWithItem.getValue() > sackWithoutItem.getValue()){
                return sackWithItem;
            }else{
                return sackWithoutItem;
            }

        }
            
        
    
    }
}
