package AB07_Sortierungen;

import java.util.Arrays;
import java.util.Random;

public class Quick {
    public static void main(int[] A) {
        quickSort(A, 0, A.length-1);
    }

    private static void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int pIndex = partition(A, low, high);
            quickSort(A, low, pIndex - 1);
            quickSort(A, pIndex + 1, high);
        }
    }

    private static void swap(int[] A, int i, int pIndex) {
        int temp = A[i];
        A[i] = A[pIndex];
        A[pIndex] = temp;
    }

    private static int partition(int[] A, int start, int end) {
        int pivot = A[end];
        int pIndex = start;

        for (int i = start; i < end; i++){
            if(A[i] <= pivot){
                swap(A, i, pIndex);

                pIndex++;
            }
        }
        swap(A, pIndex, end);
        return pIndex;
    }
}
