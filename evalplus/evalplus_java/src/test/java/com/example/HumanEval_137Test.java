package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_137Test {

    @Test
    public void test_0() {
        assertEquals(2, HumanEval_137.compare_one(1, 2));
    }

    @Test
    public void test_1() {
        assertEquals(2.5, HumanEval_137.compare_one(1, 2.5));
    }

    @Test
    public void test_2() {
        assertEquals(3, HumanEval_137.compare_one(2, 3));
    }

    @Test
    public void test_3() {
        assertEquals(6, HumanEval_137.compare_one(5, 6));
    }

    @Test
    public void test_4() {
        assertEquals("2,3", HumanEval_137.compare_one(1, "2,3"));
    }

    @Test
    public void test_5() {
        assertEquals("6", HumanEval_137.compare_one("5,1", "6"));
    }

    @Test
    public void test_6() {
        assertEquals("2", HumanEval_137.compare_one("1", "2"));
    }

    @Test
    public void test_7() {
        assertEquals(null, HumanEval_137.compare_one("1", 1));
    }

    @Test
    public void test_8() {
        assertEquals(null, HumanEval_137.compare_one(3, 3));
    }

    @Test
    public void test_9() {
        assertEquals(2.5, HumanEval_137.compare_one(-2.5, 2.5));
    }

    @Test
    public void test_10() {
        assertEquals(null, HumanEval_137.compare_one("5,000", "5,000"));
    }

    @Test
    public void test_11() {
        assertEquals("1,45", HumanEval_137.compare_one(1, "1,45"));
    }

    @Test
    public void test_12() {
        assertEquals(null, HumanEval_137.compare_one(10, "10.0"));
    }

    @Test
    public void test_13() {
        assertEquals("33", HumanEval_137.compare_one("33", "4,45"));
    }
}
// End of Test
