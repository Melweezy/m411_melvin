package AB07_Sortierungen;

import java.util.Arrays;

public class Sortierungen {
    public static void main(String[] args){
        int[] array = new int[] {1,2,4,5,3};

//        for (int i = 0; i < array.length-1; i++){
//            array[i] = (int) (Math.random()*10);
//        }

        double start= System.currentTimeMillis();

//        Arrays.sort(array);
//        InsertionSort(array);
//        BubbleSort(array);
        SelectionSort(array);

        double now= System.currentTimeMillis();

        for (int item: array
             ) {
            System.out.print(item + ",");
        }

        double elapsedTime = (now-start);
        System.out.println("\n" + elapsedTime +"ms");
    }

    public static int[] InsertionSort(int[] array){
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
