package com.example;
import org.junit.Assert;
import org.junit.Test;

public class HumanEval_65Test {
    @Test
    public void test_0() {
        Assert.assertEquals("001", HumanEval_65.circularShift(100, 2));
    }

    @Test
    public void test_1() {
        Assert.assertEquals("12", HumanEval_65.circularShift(12, 2));
    }

    @Test
    public void test_2() {
        Assert.assertEquals("79", HumanEval_65.circularShift(97, 8));
    }

    @Test
    public void test_3() {
        Assert.assertEquals("21", HumanEval_65.circularShift(12, 1));
    }

    @Test
    public void test_4() {
        Assert.assertEquals("11", HumanEval_65.circularShift(11, 101));
    }

    @Test
    public void test_5() {
        Assert.assertEquals("120934", HumanEval_65.circularShift(341209, 4));
    }

    @Test
    public void test_6() {
        Assert.assertEquals("61", HumanEval_65.circularShift(16, 3));
    }

    @Test
    public void test_7() {
        Assert.assertEquals("987654321", HumanEval_65.circularShift(987654321, 9));
    }

    @Test
    public void test_8() {
        Assert.assertEquals("534", HumanEval_65.circularShift(345, 1));
    }

    @Test
    public void test_9() {
        Assert.assertEquals("005", HumanEval_65.circularShift(500, 4));
    }

    @Test
    public void test_10() {
//        Assert.assertEquals("1234567890987654324", HumanEval_65.circularShift(1234567890987654324L, 0));
    }

    @Test
    public void test_11() {
        Assert.assertEquals("32", HumanEval_65.circularShift(23, 789456124));
    }

    @Test
    public void test_12() {
        Assert.assertEquals("01", HumanEval_65.circularShift(10, 1));
    }

    @Test
    public void test_13() {
        Assert.assertEquals("0", HumanEval_65.circularShift(0, 1000));
    }
}
// End of Test

