package selectionSort;

import static java.lang.System.out;

public class Main {
    private static SortArray sortArray = new SortArray();

    public static void main(String[] args) {
        int[] arr = {-5, 27, 4, -98, 66, 12, 3, -22, 24, 23};

        out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }

        sortArray.selectionSort(arr);

        out.println("\nAfter: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }
    }
}
