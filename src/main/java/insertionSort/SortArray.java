package insertionSort;

public class SortArray {
    public static int[] insertSort(int[] arr) {
        //Temporary variable to save lower value
        int temp;
        //Outer loop - pivot
        for (int i = 1; i < arr.length; i++) {
            //Inner loop to rotate variables
            for (int j = i; j > 0; j--) {
                //If pivot value is less than pivot-1 element...
                if (arr[j] < arr[j - 1]) {
                    //Assign value of pivot to temporary variable
                    temp = arr[j];
                    //Assign higher value to current pivot
                    arr[j] = arr[j - 1];
                    //Assign lower value to pivot-1 element
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
