package AB07_Sortierungen;

public class Insertion {
    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int valueToSort = array[i];
            int pos = i;
            while (pos > 0 && array[pos - 1] > valueToSort){
                array[pos] = array[pos -1];
                pos--;
            }
            array[pos] = valueToSort;
        }
        return array;
    }
}
