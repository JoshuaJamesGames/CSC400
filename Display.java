public class Display {
    Order[] names;
    Order[] numbers;

    Display(Orders orders){
        //QuickSort sorter = new QuickSort();
        names = orders.toArray();
        QuickSort.quickSort(names,0, orders.size()-1, new Order.SortByName());

        numbers = orders.toArray();
        QuickSort.quickSort(numbers, 0, orders.size()-1, new Order.SortByOrder());
    }

    //Formatted Print by Name and Number
    public void print(){
        System.out.println("\nCurrent Orders - By Name:");
        for(Order order: names){
            System.out.println(order);
        }
        System.out.println("\nCurrent Orders - By Number:");
        for(Order order: numbers){
            System.out.println(order);
        }       
    }
}
