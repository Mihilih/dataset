package com.example;
// Here is the equivalent Java Junit test code:


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;

public class HumanEval_113Test {

    @Test
    public void testOddCount1() {
        List<String> lst = Arrays.asList("1234567");
        List<String> expected = Arrays.asList("the number of odd elements 4 in the string 4 of the input.");
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }

    @Test
    public void testOddCount2() {
        List<String> lst = Arrays.asList("3", "11111111");
        List<String> expected = Arrays.asList("the number of odd elements 1 in the string 1 of the input.", "the number of odd elements 8 in the string 8 of the input.");
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }

    @Test
    public void testOddCount3() {
        List<String> lst = Arrays.asList("271", "137", "314");
        List<String> expected = Arrays.asList("the number of odd elements 2 in the string 2 of the input.", "the number of odd elements 3 in the string 3 of the input.", "the number of odd elements 2 in the string 2 of the input.");
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }

    @Test
    public void testOddCount4() {
        List<String> lst = Arrays.asList("2468");
        List<String> expected = Arrays.asList("the number of odd elements 0 in the string 0 of the input.");
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }

    @Test
    public void testOddCount5() {
        List<String> lst = Arrays.asList("13579", "2468", "357");
        List<String> expected = Arrays.asList("the number of odd elements 5 in the string 5 of the input.", "the number of odd elements 0 in the string 0 of the input.", "the number of odd elements 3 in the string 3 of the input.");
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }

    @Test
    public void testOddCount6() {
        List<String> lst = Arrays.asList("11224466558888", "55555", "1234567");
        List<String> expected = Arrays.asList("the number of odd elements 4 in the string 4 of the input.", "the number of odd elements 5 in the string 5 of the input.", "the number of odd elements 4 in the string 4 of the input.");
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }

    @Test
    public void testOddCount7() {
        List<String> lst = Arrays.asList();
        List<String> expected = Arrays.asList();
        assertEquals(expected, HumanEval_113.oddCount(lst));
    }
}

// End of Test.
