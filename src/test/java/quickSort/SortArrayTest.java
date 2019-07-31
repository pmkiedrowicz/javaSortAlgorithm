package quickSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    private SortArray sortArray = new SortArray();

    @Test
    void partition() {
        //given
        int[] a1 = {25, 22, 13, 27, 12, 4};
        int[] a2 = {25, 22, 13, 27, 12, 30};
        int[] a3 = {25, 22, 13, 27, 12, 23};
        int[] a4 = {1};
        int[] a5 = {2, 1};
        int[] a6 = {3, 1, 2};
        //when

        //then
        assertEquals(0, sortArray.partition(a1, 0, a1.length - 1));
        assertEquals(5, sortArray.partition(a2, 0, a2.length - 1));
        assertEquals(3, sortArray.partition(a3, 0, a3.length - 1));
        assertEquals(0, sortArray.partition(a4, 0, a4.length - 1));
        assertEquals(0, sortArray.partition(a5, 0, a5.length - 1));
        assertEquals(1, sortArray.partition(a6, 0, a6.length - 1));
    }

    @Test
    void quickSort() {
        //given
        int[] a1 = {25, 22, 13, 27, 12, 4};
        int[] a2 = {25, 22, 13, 27, 12, 30};
        int[] a3 = {25, 22, 13, 27, 12, 23};
        int[] a4 = {25};
        int[] a5 = {25, 13};
        int[] a6 = {25, 13, 22};

        int[] b1 = {4, 12, 13, 22, 25, 27};
        int[] b2 = {12, 13, 22, 25, 27, 30};
        int[] b3 = {12, 13, 22, 23, 25, 27};
        int[] b4 = {25};
        int[] b5 = {13, 25};
        int[] b6 = {13, 22, 25};

        //then

        //when
        assertArrayEquals(b1, sortArray.quickSort(a1, 0, a1.length - 1));
        assertArrayEquals(b2, sortArray.quickSort(a2, 0, a2.length - 1));
        assertArrayEquals(b3, sortArray.quickSort(a3, 0, a3.length - 1));
        assertArrayEquals(b4, sortArray.quickSort(a4, 0, a4.length - 1));
        assertArrayEquals(b5, sortArray.quickSort(a5, 0, a5.length - 1));
        assertArrayEquals(b6, sortArray.quickSort(a6, 0, a6.length - 1));
    }
}
