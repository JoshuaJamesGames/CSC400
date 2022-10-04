import java.util.ArrayList;

public class Orders {
    //Using an ArrayList for the Queue data structure
    ArrayList<Order> orders = new ArrayList<Order>();

    public void add(Order order){
        orders.add(order);
    }

    public void remove(Order order){
        orders.remove(order);
    }

    public int size(){
        return orders.size();
    }

    public Order[] toArray(){

        Order[] returnArray = new Order[this.orders.size()];

        for(int i = 0; i < returnArray.length; i++){
            returnArray[i] = this.orders.get(i);
        }

        return returnArray;
    }

    public void printOrders(){
        for(int i = 0; i < orders.size(); i++){
            System.out.println(String.format("(%d) %s", i+1, orders.get(i).toString()));
        }
    }
    
}
