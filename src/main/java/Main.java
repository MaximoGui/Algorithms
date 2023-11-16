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

        long startTime = System.nanoTime();
        SelectionSort.selectionSort(numbers);
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime));

        System.out.println(Arrays.toString(numbers));
    }

}
