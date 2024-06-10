package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_125Test {
    @Test
    public void test_0() {
//        assertArrayEquals(new String[] {"Hello", "world!"}, HumanEval_125.splitWords("Hello world!"));
    }

    @Test
    public void test_1() {
//        assertArrayEquals(new String[] {"Hello", "world!"}, HumanEval_125.splitWords("Hello,world!"));
    }

    @Test
    public void test_2() {
//        assertArrayEquals(new String[] {"Hello", "world,!"}, HumanEval_125.splitWords("Hello world,!"));
    }

    @Test
    public void test_3() {
//        assertArrayEquals(new String[] {"Hello,Hello,world", "!"}, HumanEval_125.splitWords("Hello,Hello,world !"));
    }

    @Test
    public void test_4() {
        assertEquals(3, HumanEval_125.splitWords("abcdef"));
    }

    @Test
    public void test_5() {
        assertEquals(2, HumanEval_125.splitWords("aaabb"));
    }

    @Test
    public void test_6() {
        assertEquals(1, HumanEval_125.splitWords("aaaBb"));
    }

    @Test
    public void test_7() {
        assertEquals(0, HumanEval_125.splitWords(""));
    }

    @Test
    public void test_8() {
        assertEquals(2, HumanEval_125.splitWords("Hello?"));
    }

    @Test
    public void test_9() {
//        assertArrayEquals(new String[] {"abc", "deg"}, HumanEval_125.splitWords("abc deg"));
    }

    @Test
    public void test_10() {
//        assertArrayEquals(new String[] {"aaa", "bbb"}, HumanEval_125.splitWords("aaa,bbb"));
    }

    @Test
    public void test_11() {
        assertEquals(2, com.example.HumanEval_125.splitWords("wOWbbX"));
    }

    @Test
    public void test_12() {
        assertEquals(2, com.example.HumanEval_125.splitWords("ababc123"));
    }
}
//End of Test
