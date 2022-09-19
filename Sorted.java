public class Sorted {
    
    public <T extends Comparable<? super T>> boolean ascending(T[] checkArray){

        int index = 0;

        while(index++ < checkArray.length){
            if(checkArray[index].compareTo(checkArray[index +1]) > 0){
                return false;
            }            
        }

        return true;
    }

}
