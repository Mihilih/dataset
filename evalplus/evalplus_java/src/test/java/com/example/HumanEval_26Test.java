package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class HumanEval_26Test {

    @Test
    public void testRemoveDuplicates_0() {
        assertEquals(new ArrayList<Integer>(), HumanEval_26.removeDuplicates(new ArrayList<Integer>()));
    }

    @Test
    public void testRemoveDuplicates_1() {
        assertEquals(Arrays.asList(1, 2, 3, 4), HumanEval_26.removeDuplicates(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    public void testRemoveDuplicates_2() {
        assertEquals(Arrays.asList(1, 4, 5), HumanEval_26.removeDuplicates(Arrays.asList(1, 2, 3, 2, 4, 3, 5)));
    }

    @Test
    public void testRemoveDuplicates_3() {
        assertEquals(new ArrayList<Integer>(), HumanEval_26.removeDuplicates(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4)));
    }

    @Test
    public void testRemoveDuplicates_4() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), HumanEval_26.removeDuplicates(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }

    @Test
    public void testRemoveDuplicates_5() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 7, 8), HumanEval_26.removeDuplicates(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8)));
    }

    @Test
    public void testRemoveDuplicates_6() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, -1, 7), HumanEval_26.removeDuplicates(Arrays.asList(1, 2, 3, 4, 5, 6, -1, 7, 8, 9, 8, 9, 9)));
    }
}
// End of Test
