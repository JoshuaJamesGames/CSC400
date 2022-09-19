import java.util.Comparator;

public class Order implements Comparable<Order>{

    String lastName = "";
    int orderNumber = -1;
    double totalCost = 0.00;

    Order(String lastName, int orderNumber, double totalCost){
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.totalCost = totalCost;
    }

    @Override
    public String toString(){
        return (String.format("Last Name: %s, Order Number: %d, Total Cost: %2.f",lastName, orderNumber, totalCost));
    }

    //Comparator interface for sorting by roll number
    static class SortByOrder implements Comparator<Order> {
 
        //Sort in ascending order of roll number
        public int compare(Order a, Order b){
 
            return a.orderNumber - b.orderNumber;
        }
    }
 
    
    //Comparator interface for sorting by name
    static class Sortbyname implements Comparator<Order>{
    
        //Sort in ascending order of name
        public int compare(Order a, Order b){
    
            return a.lastName.compareTo(b.lastName);
        }
    }

    //Comparable interface sorts by totalCost

    public int compareTo(Order a){
        if (totalCost < a.totalCost){
            return -1;
        }else if(totalCost > a.totalCost){
            return 1;
        }else{
            return 0;
        }
    }

    
}
