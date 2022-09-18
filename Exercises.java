public class Exercises {      
    
    
    public static long reverseFactorial(int start, int number){

        //Solves factorial from number -> 1 (1*2*3*4..*number)
        //Uses a start index to reverse the order
        if(start == number){  
            System.out.print(number + " = ");          
            return start;
        }else{
            System.out.print(start+"*");
            return start * reverseFactorial(start + 1, number);
                        
        }        

    }

    public static long factorial(int number){

        //Solves factorial from 1 -> number (number...*4*3*2*1)
        if(number > 1){
            System.out.print(number+"*");
            return number * factorial(number - 1);
        }else{
            System.out.print("1 = ");
            return 1;
        }
            
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
