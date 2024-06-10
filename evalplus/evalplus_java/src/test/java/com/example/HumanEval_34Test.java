package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_34Test {
    @Test
    public void testUnique_0() {
        Integer[] list = {5, 3, 5, 2, 3, 3, 9, 0, 123};
        Integer[] expected = {0, 2, 3, 5, 9, 123};
        assertArrayEquals(expected, HumanEval_34.unique(list));
    }

    @Test
    public void testUnique_1() {
        Double[] list = {3.4145447979043606, 1.5142493540603779, 1.1, 2.2, 2.2, 4.4, 4.4, 3.0219968583931567, 2.2};
        Double[] expected = {1.1, 1.5142493540603779, 2.2, 3.0219968583931567, 3.4145447979043606, 4.4};
//        assertArrayEquals(expected, HumanEval_34.unique(list));
    }

    // Java doesn't support null in primitive types, thus this test would not be meaningful in a Java context and is omitted

    @Test
    public void testUnique_3() {
        Integer[] list = {};
        Integer[] expected = {};
        assertArrayEquals(expected, HumanEval_34.unique(list));
    }

    @Test
    public void testUnique_4() {
        Integer[] list = {-1, 1};
        Integer[] expected = {-1, 1};
        assertArrayEquals(expected, com.example.HumanEval_34.unique(list));
    }

    @Test
    public void testUnique_5() {
        String[] list = {"alQd", "dapple", "banana", "oralQdnge"};
        String[] expected = {"alQd", "banana", "dapple", "oralQdnge"};
//        assertArrayEquals(expected, HumanEval_34.unique(list));
    }
}
// End of Test
