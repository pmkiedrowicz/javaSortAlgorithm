package bubbleSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SortArrayTest {
    private SortArray sortArray = new SortArray();

    @Test
    public void bubbleSortWhenArrayEquals() {
        //given
        int[] before1 = {55, 1, 23, 78, 33, 45};
        int[] expect1 = {1, 23, 33, 45, 55, 78};
        int[] before2 = {44, 66, 22, 77};
        int[] expect2 = {22, 44, 66, 77};
        //when

        //then
        assertArrayEquals(expect1, sortArray.bubbleSort(before1));
        assertArrayEquals(expect2, sortArray.bubbleSort(before2));
    }

    @Test
    public void bubbleSortWhenArrayEmpty() {
        //given
        int[] before1 = {};
        int[] expect1 = {};
        //when

        //then
        assertArrayEquals(expect1, sortArray.bubbleSort(before1));
    }
}