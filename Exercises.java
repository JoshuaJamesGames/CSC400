public class Exercises {      
    
    
    public static long factorial(int number){
        //Solves factorial from number -> 1 (1*2*3*4..*number)
        if(number <= 1){
            return 1;
        }else{
            return number * factorial(number -1);
        }        

    }

    public static long reverseFactorial(int number){
        //Solves factorial from 1 -> number (number...*4*3*2*1)
        if(number >= 1)
            return number * reverseFactorial(number - 1);
        else
            return 1;
    }

    public static void displayPortion(char array[],int start, int end){
        //Prints the portion of array starting with the end index -> index start
        //Reversing the portion
        System.out.print(array[end]);

        if(end > start){   

            displayPortion(array, start, end-1);

        }
    }
    
}
