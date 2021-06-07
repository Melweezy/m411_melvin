package AB07_Sortierungen;

public class Merge {

    public static void merge(int[] first, int[] second, int[] array)
    {
        int iFirst = 0; //next element to consider in the first array
        int iSecond = 0; //next element to consider in the second array
        int j = 0; //next open position in a
        while((iFirst < first.length) && (iSecond < second.length)){
            if(first[iFirst] < second[iSecond]){
                array[j] = first[iFirst];
                iFirst++;
            } else {
                array[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        while (iFirst < first.length){
            array[j] = first[iFirst];
            iFirst++;
            j++;
        }
        while (iSecond < second.length){ //Copy any remaining entries of the second half
            array[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }


    public static void mergesort(int[] array) {
        if (array.length == 1) {
            return;
        } else {
            int[] first = new int[array.length / 2];
            int[] second = new int[array.length - first.length];
            System.arraycopy(array, 0, first, 0, first.length);
            System.arraycopy(array, first.length, second, 0, second.length);

            mergesort(first);
            mergesort(second);
            merge(first, second, array);
        }
    }
}
