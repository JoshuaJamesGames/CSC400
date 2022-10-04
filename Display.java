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

    public void print(){
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + " " + numbers[i]);
        }        
    }
}
