import java.util.InputMismatchException;
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
    //Mainline logic
    public static void main(String[] args) {

        //Create 2 required classes Orders & Display
        Orders orders = new Orders();
        Display ordersDisplay = new Display(orders);
        //Need a Scanner to collect input
        Scanner scnr = new Scanner(System.in);
                
        intro();

        //Just like it sounds
        orderLoop(orders, ordersDisplay, scnr);

        outtro();
  
    }

    //Introduction to the program
    public static void intro(){
        System.out.println("Welcome to the Fast Food order display system.");
    }

    //Loops through the choices and responds to user commands
    public static void orderLoop(Orders orders, Display orderDisplay, Scanner scnr){
        
        String choice = "";
        
        //Initialize the loop
        showChoices();
        choice = scnr.next();

        while(!choice.equals("q")){

            //Choices are given as numbers but collected as strings
            //to avoid parsing

            //Add Order
            if(choice.equals("1")){
                addOrder(scnr, orders);

            //Remove Order
            }else if(choice.equals("2")){

                if(orders.size() > 0){
                    removeOrder(scnr, orders);
                }else{
                    System.out.println("There are no orders.");
                }
                
            //Display Orders
            }else if(choice.equals("3")){

                if(orders.size() > 0){
                    orders.printOrders();
                }else{
                    System.out.println("There are no orders.");
                }
                
            //Since we aren't parsing, any key not on the list is invalid
            }else{
                System.out.println("That's not a valid option");
            }

            //Collect the next choice
            showChoices();
            choice = scnr.next();

        }

    }

    //Collects a name for the Order
    public static String getName(Scanner scnr){

        String name = "";
        System.out.print("What name is this for?: ");
        name = scnr.next();
        return name;
    }

    //Prints the menu of Choices
    public static void showChoices(){
        String[] choices = {

            "(1) Add Order",
            "(2) Remove Order",
            "(3) Show Orders",
            "(q) Quit"
        };

        System.out.println();
        for(int i =0; i < choices.length; i++){
            System.out.println(choices[i]);
        }
        System.out.print("\nWhat would you like to do?: ");

    }

    //Add an order to Orders and triggers Display class
    public static void addOrder(Scanner scnr, Orders orders){
        String name = getName(scnr);
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
        System.out.print("\nWhat would you like, " + name + "?: ");

        selection = scnr.next();
        if(!selection.equals("d")){

            int selectedInt = -1;
            try{
                selectedInt = Integer.parseInt(selection)-1;
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
        }
    }

    //Removes an order from Orders and triggers Display class
    public static void removeOrder(Scanner scnr, Orders orders){

        int removeChoice = -1;

        orders.printOrders();
        System.out.print("What order would you like to remove?: ");

            try{
                removeChoice = scnr.nextInt()-1;
            }catch (InputMismatchException e){
                System.out.println("That wasn't a number");
            }            

        if(removeChoice >=0 && removeChoice < orders.size()){

            System.out.println("\nRemoving : "+ orders.getOrderAt(removeChoice).toString());
            orders.remove(orders.getOrderAt(removeChoice));

            Display display = new Display(orders);
            display.print();

        }else{
            System.out.println("\nThat is not an order");
        }
        
    }

    //Classic Outtro
    public static void outtro(){
        System.out.println("\nGoodbye");
    }
}


