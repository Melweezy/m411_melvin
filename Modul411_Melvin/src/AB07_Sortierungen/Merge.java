package AB07_Sortierungen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int array[], int left, int mid, int right)
    {
        // Find sizes of two subarrays to be merged
        int sizeArray1 = mid - left + 1;
        int sizeArray2 = right - mid;

        /* Create temp arrays */
        int[] leftArray = new int[sizeArray1];
        int[] rightArray = new int[sizeArray2];

        /*Copy data to temp arrays*/
        if (sizeArray1 >= 0 && sizeArray2 >= 0){
            System.arraycopy(array, left, leftArray, 0, sizeArray1);
            System.arraycopy(array, mid + 1, rightArray, 0, sizeArray2);
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < sizeArray1 && j < sizeArray2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < sizeArray1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < sizeArray2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main function that sorts array[l..rightEnd] using
    // merge()
    static void sort(int[] array, int leftStart, int rightEnd)
    {
        if (leftStart < rightEnd) {
            // Find the middle point
            int middle = leftStart + (rightEnd-leftStart)/2;

            // Sort first and second halves
            sort(array, leftStart, middle);
            sort(array, middle + 1, rightEnd);

            // Merge the sorted halves
            merge(array, leftStart, middle, rightEnd);
        }
    }

    // Driver code
    public static void main(int[] array)
    {
        sort(array, 0, array.length - 1);
    }
}
