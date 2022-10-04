import java.util.Scanner;

/*
Write a program that handles the order list for an online retailer. 
Your program should contain a minimum of three classes:

Orders Class
Display Class
Main Class

Create a Orders Class that uses a queue to hold the orders in the order 
they were taken. The queue should contain the customer last name, order 
number, and order total cost.

Create a Display Class that will store a copy of the orders queue in 
two arrays. Each array will contain the order list but one will be 
sorted by name and the other sorted by order number. When an order is 
taken and stored in the Order Class the program will update the
Display Class arrays automatically and sort them in descending order using 
quick sort and output the contents to the console upon each entry of 
new data.

Create a Main Class that will handle operator data input and when an order 
is added or removed, the program will update the Order Class and Display 
Class. The user will be presented a menu to add an order, remove an order 
and display the order list from the queue.
*/

public class CSC400_Portfolio_Project {
    public static void main(String[] args) {

        Orders orders = new Orders();
        Display ordersDisplay = new Display(orders);
        Scanner scnr = new Scanner(System.in);
                
        intro();

        orderLoop(orders, ordersDisplay, scnr);

        outtro();
  
    }

    public static void intro(){

    }

    public static void orderLoop(Orders orders, Display orderDisplay, Scanner scnr){

        
        String choice = "";
        String name = "";

        if(name.equals("")){
            name = getName(scnr);
        }
        showChoices(name);
        choice = scnr.next();

        while(!choice.equals("q")){

            
            if(choice.equals("1")){
                addOrder(name, scnr, orders);
            }else if(choice.equals("2")){
                removeOrder(name, scnr);
            }else if(choice.equals("3")){
                name = getName(scnr);
            }else{
                System.out.println("That's not a valid option");
            }

            showChoices(name);
            choice = scnr.next();

        }

    }

    public static String getName(Scanner scnr){

        String name = "";
        System.out.print("What name is this order for?: ");
        name = scnr.next();
        return name;
    }

    public static void showChoices(String name){
        String[] choices = {

            "(1) Add Order",
            "(2) Remove Order",
            "(3) Change Name",
            "(q) Quit"
        };

        System.out.println(name + ", what would you like to do?:");
        for(int i =0; i < choices.length; i++){
            System.out.println(choices[i]);
        }

    }

    public static void addOrder(String name, Scanner scnr, Orders orders){

        String selection = "";
        String[] menu = {

            "(1) Hot Dog Combo: $1.50",
            "(2) Chicken Bake: $2.99",
            "(3) Turkey Sandwich: $3.99",
            "(4) Brisket Sandwich: $4.99",
            "(5) Chicken Ceasar Salad: $3.99",
            "(6) Pizza Slice: $1.99",
            "(7) Whole Pizza: $9.99",
            "(8) Soda: $0.59",
            "(9) Very Berry Sundae: $1.65",
            "(d) Done"

        };

        System.out.println("\nThe Menu: ");
        for(int i =0; i < menu.length; i++){
            System.out.println(menu[i]);
        }
        System.out.print("What would you like, " + name + "?: ");

        selection = scnr.next();
        while(!selection.equals("d")){

            int selectedInt = -1;
            try{
                selectedInt = Integer.parseInt(selection)-1;
                System.out.println(selectedInt + " " + orders.size());
            } catch(NumberFormatException e){
                System.out.println("\n That's not on the menu!");
            }
            
            if(selectedInt >= 0 && selectedInt < menu.length-1){

                String orderItem = menu[selectedInt].split(":")[0];                
                double cost = Double.valueOf(menu[selectedInt].split("\\$")[1]);
                
                orders.add(new Order(name, orders.size()+1, cost, orderItem));
                
                Display display = new Display(orders);
                display.print();
            }

            System.out.println("Anything else?: ");
            selection = scnr.next();

        }



    }

    public static void removeOrder(String name, Scanner scnr){

    }

    public static void outtro(){

    }
}


