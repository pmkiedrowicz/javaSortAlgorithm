package bubbleSort;

import static java.lang.System.out;

public class BubbleSort {
    private static SortArray sortArray = new SortArray();

    public static void main(String[] args) {
        int[] arr = {22, 5, 27, 4, 98, 66, 12};

        out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }

        sortArray.bubbleSort(arr);

        out.println("\nAfter: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }
    }
}
