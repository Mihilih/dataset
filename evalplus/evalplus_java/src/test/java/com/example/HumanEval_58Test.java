package com.example;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class HumanEval_58Test {

    @Test
    public void testCommon1() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 3, 34, 653, 2, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 7, 1, 5, 9, 653, 121));
        assertEquals(Arrays.asList(1, 5, 653), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon2() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 3, 2, 8));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 2));
        assertEquals(Arrays.asList(2, 3), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon3() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 3, 2, 8));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 2, 4));
        assertEquals(Arrays.asList(2, 3, 4), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon4() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 3, 2, 8));
        ArrayList<Integer> list2 = new ArrayList<>();
        assertEquals(new ArrayList<>(), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon5() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 5, 5));
        assertEquals(Arrays.asList(5), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon6() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(new ArrayList<>(), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon7() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4));
        assertEquals(Arrays.asList(4), HumanEval_58.common(list1, list2));
    }

    @Test
    public void testCommon8() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-45, 34));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(35));
        assertEquals(new ArrayList<>(), HumanEval_58.common(list1, list2));
    }
}
// End of Test
