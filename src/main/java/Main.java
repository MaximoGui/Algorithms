import search.BinarySearch;
import sort.MergeSort;
import sort.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        System.out.println(Arrays.toString(numbers));

        /*long startTime = System.nanoTime();
        SelectionSort.selectionSort(numbers);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime));
*/
        long startTime = System.nanoTime();
        MergeSort.mergeSort(numbers);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime));

        /*System.out.println(Arrays.toString(numbers));

        int[] ints = {1, 2, 3, 4, 5, 7, 9, 13};

        System.out.println(BinarySearch.search(ints, 5));*/

    }

}
