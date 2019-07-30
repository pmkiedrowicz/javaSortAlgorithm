package selectionSort;

public class SortArray {
    public static int[] selectionSort(int[] arr) {
        //Outer loop for indexing arr
        for (int i = 0; i < arr.length - 1; i++) {
            //Temporary variable to get index of smaller number
            int step = i;
            //Inner loop to iterate through left values
            for (int j = i + 1; j < arr.length; j++) {
                //If next value is less than pivot value
                if (arr[j] < arr[step])
                    //Assign j as index of less value array element
                    step = j;
            }
            //Assign less number value to temporary variable small
            int small = arr[step];
            //Assign higher value to index of smaller value
            arr[step] = arr[i];
            //Assign small value to current pivot
            arr[i] = small;
        }
        return arr;
    }
}