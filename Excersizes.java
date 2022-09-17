public class Excersizes {
    
    
    
    public static long factorial(int number){

        if(number <= 1){
            return 1;
        }else{
            return number * factorial(number -1);
        }        

    }

    public static long reverseFactorial(int number)
    {
        if(number >= 1)
            return number * reverseFactorial(number - 1);
        else
            return 1;
    }

    public static void displayPortion(Object array[], int end){

        System.out.println(array[end].toString());

        if(end > 0){   

            displayPortion(array, end-1);

        }
    }
    
}
