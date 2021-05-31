package AB07_Sortierungen;

import java.util.Arrays;

public class Sortierungen {
    public static void main(String[] args){
//        int[] array = new int[] {1,2,4,5,3};

        int[] array = new int[10];
        for (int i = 0; i < array.length-1; i++){
            array[i] = (int) (Math.random()*1000);
        }

        double start= System.currentTimeMillis();

//        Arrays.sort(array);
//        Insertion.insertionSort(array);
//        Bubble.bubbleSort(array);
//        Selection.selectionSort(array);
        Merge.main(array);

        double now= System.currentTimeMillis();

        for (int item: array
             ) {
            System.out.print(item + ",");
        }

        double elapsedTime = (now-start);
        System.out.println("\n" + elapsedTime +"ms");
    }
}
