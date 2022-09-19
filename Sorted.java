import java.util.ArrayList;
import java.util.Comparator;

public class Sorted {

    //ArrayList
    public static <T extends Comparable<T>> boolean ascending(ArrayList<T> checkArray){

        int index = 0;

        while(index < checkArray.size() -1){
            if(checkArray.get(index).compareTo(checkArray.get(index +1)) > 0){
                return false;
            } 
            index++;           
        }

        return true;
    }

    //Generic Array with Comparator
    public static <T> boolean ascending(T[] checkArray, Comparator<? super T> comparator){

        int index = 0;

        while(index < checkArray.length -1){
            if(comparator.compare(checkArray[index], checkArray[index +1]) > 0){
                return false;
            } 
            index++;           
        }

        return true;
    }

    //Generic Array without Comparator
    public static <T extends Comparable<? super T>> boolean ascending(T[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index].compareTo(checkArray[index +1]) > 0){
                return false;
            } 
            index++;           
        }

        return true;
    }

    //Byte
    public static boolean ascending(byte[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            }   
            index++;         
        }

        return true;
    }

    //Char
    public static boolean ascending(char[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            }  
            index++;          
        }

        return true;
    }

    //Double
    public static boolean ascending(double[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            }  
            index++;          
        }

        return true;
    }

    //Float
    public static boolean ascending(float[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            }  
            index++;          
        }

        return true;
    }

    //Int
    public static boolean ascending(int[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            }  
            index++;                     
        }

        return true;
    }

    //long
    public static boolean ascending(long[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            }     
            index++;       
        }

        return true;
    }

    //short
    public static boolean ascending(short[] checkArray){

        int index = 0;

        while(index < checkArray.length -1){
            if(checkArray[index] > (checkArray[index +1])){
                return false;
            } 
            index++;           
        }

        return true;
    }



}
