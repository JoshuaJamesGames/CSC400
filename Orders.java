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

    public void printOrders(){
        for(int i = 0; i < orders.size(); i++){
            System.out.println(String.format("(%d) %s", i, orders.get(i)));
        }
    }
}
