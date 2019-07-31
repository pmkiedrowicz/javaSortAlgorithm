package quickSort;

import static java.lang.System.out;

public class Main {
    private static SortArray sortArray = new SortArray();

    public static void main(String[] args) {
        int[] arr = {44, -12, 69, 70, 51, 74, -23, -32, 46};

        out.println("Before: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }

        sortArray.quickSort(arr, 0, arr.length - 1);

        out.println("\nAfter: ");
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i] + " ");
        }
    }
}
