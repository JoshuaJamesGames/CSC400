import java.util.Comparator;

//Quicksort

public class QuickSort {

  // method to find the partition position
  static <T> int partition(T array[], int low, int high, Comparator<T> comparator) {
    
    // choose the rightmost element as pivot
    T pivot = array[high];
    
    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
      if (comparator.compare(array[j],pivot) <= 0) {

        // if element smaller than pivot is found
        // swap it with the greatr element pointed by i
        i++;

        // swapping element at i with element at j
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swapt the pivot element with the greater element specified by i
    T temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static <T> void quickSort(T array[], int low, int high, Comparator<T> comparator) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high, comparator);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1, comparator);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high, comparator);
    }
  }
}

