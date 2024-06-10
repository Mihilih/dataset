package com.example;



import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_64;

public class HumanEval_64Test {

    @Test
    public void test_0() {
        assertEquals(2, HumanEval_64.vowelsCount("abcde"));
    }

    @Test
    public void test_1() {
        assertEquals(3, HumanEval_64.vowelsCount("Alone"));
    }

    @Test
    public void test_2() {
        assertEquals(2, HumanEval_64.vowelsCount("key"));
    }

    @Test
    public void test_3() {
        assertEquals(1, HumanEval_64.vowelsCount("bye"));
    }

    @Test
    public void test_4() {
        assertEquals(2, HumanEval_64.vowelsCount("keY"));
    }

    @Test
    public void test_5() {
        assertEquals(1, HumanEval_64.vowelsCount("bYe"));
    }

    @Test
    public void test_6() {
        assertEquals(3, HumanEval_64.vowelsCount("ACEDY"));
    }

    @Test
    public void test_7() {
        assertEquals(2, HumanEval_64.vowelsCount("hello"));
    }

    @Test
    public void test_8() {
        assertEquals(0, HumanEval_64.vowelsCount(""));
    }

    @Test
    public void test_9() {
        assertEquals(9, HumanEval_64.vowelsCount("aAEIOUYXWouy"));
    }

    @Test
    public void test_10() {
        assertEquals(5, HumanEval_64.vowelsCount("AEIOUYX"));
    }

    @Test
    public void test_11() {
        assertEquals(24, HumanEval_64.vowelsCount("iaeaeiouyfacetiousnessioAEIOUYYXWouy"));
    }

    @Test
    public void test_12() {
        assertEquals(1, HumanEval_64.vowelsCount("Y"));
    }

    @Test
    public void test_13() {
        assertEquals(7, HumanEval_64.vowelsCount("candaeioyoyynad"));
    }
}


// End of Test
