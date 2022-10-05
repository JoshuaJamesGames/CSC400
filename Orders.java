import java.util.ArrayList;

public class Orders {
    //Using an ArrayList for the Queue data structure
    ArrayList<Order> orders = new ArrayList<Order>();

    //Add an order
    public void add(Order order){
        orders.add(order);
    }

    //Remove an order
    public void remove(Order order){        
        orders.remove(order);
    }

    //Get order by index
    public Order getOrderAt(int index){
        return orders.get(index);
    }

    //Return int size
    public int size(){
        return orders.size();
    }

    //Return an Array from Orders
    public Order[] toArray(){

        Order[] returnArray = new Order[this.orders.size()];

        for(int i = 0; i < returnArray.length; i++){
            returnArray[i] = this.orders.get(i);
        }

        return returnArray;
    }

    //Print in a Formatted maner with offset index
    public void printOrders(){
        System.out.println("\nThe Orders:");
        for(int i = 0; i < orders.size(); i++){
            System.out.println(String.format("(%d) %s", i+1, orders.get(i).toString()));
        }
    }
    
}
