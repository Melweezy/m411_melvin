package AB07_Sortierungen;

import java.util.Arrays;

public class Sortierungen {
    public static void main(String[] args){
        int[] array = new int[10000];
        for (int i = 0; i < array.length-1; i++){
            array[i] = (int) (Math.random()*2000000);
        }

        double start= System.currentTimeMillis();
//        Arrays.sort(array);
//        InsertionSort(array);
        BubbleSort(array);
//        SelectionSort(array);
        double now= System.currentTimeMillis();
        for (int item: array
             ) {
            System.out.print(item + ",");
        }

        double elapsedTime = (now-start);
        System.out.println("\n" + elapsedTime +"ms");
    }

    public static int[] InsertionSort(int[] array){
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
       return array;
    }

    public static int[] BubbleSort(int[] array){
        int temp;
        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length - (i+1); j++){
                if(array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] SelectionSort(int[] array){
        int temp, smallest;
        for(int i = 0; i < array.length-1; i++){
            smallest = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < array[smallest]){
                    smallest = j;
                }
            }
            temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
