package quickSort;

public class SortArray {
    //Method to put elements before and after pivot
    //Need 3 arguments for further ordering elements
    public int partition(int arr[], int low, int high) {
        //Set the vatiable pivot
        int pivot = arr[high];
        //Set the index of before element
        int i = (low - 1);
        //Main loop to iterate through all elements of array
        for (int j = low; j < high; j++) {
            //If next element is less or equals pivot...
            if (arr[j] <= pivot) {
                //Increment index of 'before' element
                i++;
                //Next three lines swap elements of higher value
                //in a place of lower one
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        //Next three lines swap the pivot with element higher than it
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;

        //return the index pivot+1
        return i + 1;
    }

    public int[] quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        return arr;
    }
}
