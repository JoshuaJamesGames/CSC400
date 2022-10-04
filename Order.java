import java.util.Comparator;

public class Order implements Comparable<Order>{

    String lastName = "";
    String orderItem = "";
    int orderNumber = -1;
    double cost = 0.00;

    Order(String lastName, int orderNumber, double totalCost, String orderItem){
        this.lastName = lastName;
        this.orderItem = orderItem;
        this.orderNumber = orderNumber;
        this.cost = totalCost;
    }

    @Override
    public String toString(){
        return (String.format("Last Name: %s, Order Number: %d, Item: %s, Cost: %.2f",lastName, orderNumber, orderItem, cost));
    }

    //Comparator interface for sorting by roll number
    static class SortByOrder implements Comparator<Order> {
 
        //Sort in ascending order of roll number
        public int compare(Order a, Order b){
 
            return a.orderNumber - b.orderNumber;
        }
    }
 
    
    //Comparator interface for sorting by name
    static class SortByName implements Comparator<Order>{
    
        //Sort in ascending order of name
        public int compare(Order a, Order b){
    
            return a.lastName.compareTo(b.lastName);
        }
    }

    //Comparable interface sorts by totalCost

    public int compareTo(Order a){
        if (cost < a.cost){
            return -1;
        }else if(cost > a.cost){
            return 1;
        }else{
            return 0;
        }
    }

    
}
