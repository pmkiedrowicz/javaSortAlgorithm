package bubbleSort;

public class SortArray {
    public static int[] bubbleSort(int[] arr) {
        //Get the array length, just to clear code
        int n = arr.length;
        //Temporary value of array element
        int temp;
        //Main loop, repeats (arr.length - 1) times
        for (int i = 0; i < n; i++) {
            //Inner loop for every 2nd element
            for (int j = 1; j < (n - i); j++) {
                //If first element is more than second element...
                if (arr[j - 1] > arr[j]) {
                    //assign value of first value to temp variable
                    temp = arr[j - 1];
                    //assign second value to first element in array
                    arr[j - 1] = arr[j];
                    //assing temp value to second element in array
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
