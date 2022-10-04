import java.util.Comparator;

//Quicksort

public class QuickSort {

  //Method to find the partition position
  static <T> int partition(T array[], int low, int high, Comparator<T> comparator) {
    
    //Choose the rightmost element as pivot
    //Lowest performing pivot, but easy to code
    T pivot = array[high];
    
    //Pointer for greater element
    int i = (low - 1);

    //Traverse all elements
    //Compare each with pivot
    for (int j = low; j < high; j++) {
      //If element smaller than pivot is found
      //Swap it with the greater element pointed by i
      if (comparator.compare(array[j],pivot) <= 0) {

        
        i++;

        //Swapping element at i with element at j
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    //Swap the pivot element with the greater element specified by i
    T temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    //Return the position from where partition is done
    return (i + 1);
  }

  static <T> void quickSort(T array[], int low, int high, Comparator<T> comparator) {
    if (low < high) {

      //Find pivot element such that
      //Elements smaller than pivot are on the left
      //Elements greater than pivot are on the right
      int pi = partition(array, low, high, comparator);
      
      //Recursive call on the left of pivot
      quickSort(array, low, pi - 1, comparator);

      //Recursive call on the right of pivot
      quickSort(array, pi + 1, high, comparator);
    }
  }
}

