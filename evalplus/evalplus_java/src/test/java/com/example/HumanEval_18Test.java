package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_18Test {
    
    @Test
    public void test_0() {
        assertEquals(0, HumanEval_18.howManyTimes("", "x"));
    }

    @Test
    public void test_1() {
        assertEquals(4, HumanEval_18.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    public void test_2() {
        assertEquals(4, HumanEval_18.howManyTimes("cacacacac", "cac"));
    }

    @Test
    public void test_3() {
        assertEquals(1, HumanEval_18.howManyTimes("john doe", "john"));
    }

    @Test
    public void test_4() {
        assertEquals(2, HumanEval_18.howManyTimes("ababa", "aba"));
    }

    @Test
    public void test_5() {
        assertEquals(0, HumanEval_18.howManyTimes("zz", "bbb"));
    }

    @Test
    public void test_6() {
        assertEquals(5, HumanEval_18.howManyTimes("aaaaabbbbaaaa", "aaa"));
    }

    @Test
    public void test_7() {
        assertEquals(2, HumanEval_18.howManyTimes("hello world", "o"));
    }

    @Test
    public void test_8() {
        assertEquals(0, HumanEval_18.howManyTimes("", "adipiscilang"));
    }

    @Test
    public void test_9() {
        assertEquals(0, HumanEval_18.howManyTimes("AAAAaaaaaaaabaaaaaaaAAA", "AAAAAAA"));
    }

    @Test
    public void test_10() {
        assertEquals(0, HumanEval_18.howManyTimes("aaaabbbcbcccc", "hello woorrld"));
    }

    @Test
    public void test_11() {
        assertEquals(44, HumanEval_18.howManyTimes("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB", "AAAAAAA"));
    }

    @Test
    public void test_12() {
        assertEquals(1, HumanEval_18.howManyTimes(" ", " "));
    }

    @Test
    public void test_13() {
        assertEquals(3, HumanEval_18.howManyTimes("12211221122", "122"));
    }
}

// End of Test.
