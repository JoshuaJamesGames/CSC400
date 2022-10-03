import java.util.ArrayDeque;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String choice = "";
        ArrayDeque<String> line = new ArrayDeque<String>();

        intro();


        choice = getNextChoice(scnr);
        while(!choice.equals("q")){
            if(choice.equals("1")){
                line.add(getName(scnr));
            }else if(choice.equals("2")){
                if(!line.isEmpty()){
                    System.out.println("\n" + line.remove() + " removed from the line.");
                }else{
                    System.out.println("\nThe line is empty!");
                }
            }else if(choice.equals("3")){
                if(!line.isEmpty()){
                    System.out.println("\nThe line contains:");
                    for(Object name: line.toArray()){
                        System.out.println(name.toString());
                    };
                }else{
                    System.out.println("The line is empty!");
                }
            }else if(choice.equals("4")){
                System.out.println("\nCleared the line!");
                line.clear();
            }else{
                System.out.println("That is not an Option");
            }        
                choice = getNextChoice(scnr);
            
        }

        outtro();
    }

    public static void intro(){
        System.out.println("Welcome to the Queue Control.");
        System.out.println("Here are your Options");
    }

    public static void showMenu(){
        String choices[] = {
            "(1) Add a name to the Queue",
            "(2) Get the next name",
            "(3) Print the Queue",
            "(4) Clear the Queue",
            "(q) Quit"
        };

        System.out.println();
        for(String name: choices){
            System.out.println(name);
        }

        System.out.print("\nWhat would you like to do?: ");
    }

    public static String getNextChoice(Scanner scnr){
        showMenu();
        return scnr.next();
    }

    public static String getName(Scanner scnr){
        System.out.print("What is the next Name?: ");
        return scnr.next();
    }

    public static void outtro(){
        System.out.println("Goodbye");
    }

}
