package selectionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    private static SortArray sortArray = new SortArray();

    @Test
    void selectionSort() {
        //given
        int[] a1 = {22, 65, 1, -22, 4, -13};
        int[] a2 = {2, 65, -1, 3, 4, -3};
        int[] b1 = {-22, -13, 1, 4, 22, 65};
        int[] b2 = {-3,-1,2,3,4,65};
        //when

        //then
        assertArrayEquals(b1, sortArray.selectionSort(a1));
        assertArrayEquals(b2, sortArray.selectionSort(a2));
    }
}