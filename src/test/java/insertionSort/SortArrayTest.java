package insertionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    private static SortArray sortArray = new SortArray();

    @Test
    void insertSort() {
        //given
        int[] a1 = {6, -5, -4, 22, -8, 45, 43, -10};
        int[] a2 = {-22, 6, -4, -5, 22, 45, -1, 2};
        int[] b1 = {-10, -8, -5, -4, 6, 22, 43, 45};
        int[] b2 = {-22, -5, -4, -1, 2, 6, 22, 45};
        //when

        //then
        assertArrayEquals(b1, sortArray.insertSort(a1));
        assertArrayEquals(b2, sortArray.insertSort(a2));
    }
}