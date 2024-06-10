package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_70Test {

    @Test
    public void testStrangeSortList1() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(1, 4, 2, 3), obj.strange_sort_list(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    public void testStrangeSortList2() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(5, 5, 5, 5), obj.strange_sort_list(Arrays.asList(5, 5, 5, 5)));
    }

    @Test
    public void testStrangeSortList3() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(), obj.strange_sort_list(new ArrayList<Integer>()));
    }

    @Test
    public void testStrangeSortList4() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5), obj.strange_sort_list(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
    }

    @Test
    public void testStrangeSortList5() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2), obj.strange_sort_list(Arrays.asList(0, 2, 2, 2, 5, 5, -5, -5)));
    }

    @Test
    public void testStrangeSortList6() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(111111), obj.strange_sort_list(Arrays.asList(111111)));
    }

    @Test
    public void testStrangeSortList7() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(-5, 10, 0, 5), obj.strange_sort_list(Arrays.asList(-5, 0, 5, 10)));
    }

    @Test
    public void testStrangeSortList8() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(10, 300, 35, 200, 75, 150, 100), obj.strange_sort_list(Arrays.asList(100, 200, 300, 150, 75, 35, 10)));
    }

    @Test
    public void testStrangeSortList9() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(1, 6, 2, 5, 2, 4, 3), obj.strange_sort_list(Arrays.asList(1, 3, 5, 2, 4, 6, 2)));
    }

    @Test
    public void testStrangeSortList10() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(-10, 80, -10, 70, 0, 60, 0, 50, 8, 50, 10, 30, 21, 21), obj.strange_sort_list(Arrays.asList(50, -10, 80, 0, 70, 10, 60, 21, -10, 50, 30, 0, 8, 21)));
    }

    @Test
    public void testStrangeSortList11() {
        HumanEval_70 obj = new HumanEval_70();
        assertEquals(Arrays.asList(1), obj.strange_sort_list(Arrays.asList(1)));
    }
}
//End of Test
