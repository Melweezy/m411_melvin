package AB07_Sortierungen;

public class Selection {
    public static int[] selectionSort(int[] array){
        int temp, minIndex;
        for(int i = 0; i < array.length; i++){
            minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
