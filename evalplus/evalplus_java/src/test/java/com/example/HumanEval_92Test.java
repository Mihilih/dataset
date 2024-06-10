package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_92Test {

    @Test
    public void test_0() {
        assertEquals(true, HumanEval_92.anyInt(2, 3, 1));
    }

    @Test
    public void test_1() {
//        assertEquals(false, HumanEval_92.anyInt(2.5, 2, 3));
    }

    @Test
    public void test_2() {
//        assertEquals(false, HumanEval_92.anyInt(1.5, 5, 3.5));
    }

    @Test
    public void test_3() {
        assertEquals(false, HumanEval_92.anyInt(2, 6, 2));
    }

    @Test
    public void test_4() {
        assertEquals(true, HumanEval_92.anyInt(4, 2, 2));
    }

    @Test
    public void test_5() {
//        assertEquals(false, HumanEval_92.anyInt(2.2, 2.2, 2.2));
    }

    @Test
    public void test_6() {
        assertEquals(true, HumanEval_92.anyInt(-4, 6, 2));
    }

    @Test
    public void test_7() {
        assertEquals(true, HumanEval_92.anyInt(2, 1, 1));
    }

    @Test
    public void test_8() {
        assertEquals(true, HumanEval_92.anyInt(3, 4, 7));
    }

    @Test
    public void test_9() {
//        assertEquals(false, HumanEval_92.anyInt(3.0, 4, 7));
    }

    // ... add the rest of the tests here

}
// End of Test
