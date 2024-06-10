package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_66Test {
    @Test
    public void test_0() {
        assertEquals(0, HumanEval_66.digitSum(""));
    }
    @Test
    public void test_1() {
        assertEquals(131, HumanEval_66.digitSum("abAB"));
    }
    @Test
    public void test_2() {
        assertEquals(67, HumanEval_66.digitSum("abcCd"));
    }
    @Test
    public void test_3() {
        assertEquals(69, HumanEval_66.digitSum("helloE"));
    }
    @Test
    public void test_4() {
        assertEquals(131, HumanEval_66.digitSum("woArBld"));
    }
    @Test
    public void test_5() {
        assertEquals(153, HumanEval_66.digitSum("aAaaaXa"));
    }
    @Test
    public void test_6() {
        assertEquals(151, HumanEval_66.digitSum(" How are yOu?"));
    }
    @Test
    public void test_7() {
        assertEquals(327, HumanEval_66.digitSum("You arE Very Smart"));
    }
    @Test
    public void test_8() {
        assertEquals(0, HumanEval_66.digitSum("123"));
    }
    @Test
    public void test_9() {
//        assertEquals(680, HumanEval_66.digitSum("abcd1123A12:;<=>?@[\]^_`{|}~ABC123def456GHI3BCD"));
    }
    @Test
    public void test_10() {
        assertEquals(2015, HumanEval_66.digitSum("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
    @Test
    public void test_11() {
        assertEquals(65, HumanEval_66.digitSum("A"));
    }
    @Test
    public void test_12() {
        assertEquals(0, HumanEval_66.digitSum("a"));
    }
    @Test
    public void test_13() {
        assertEquals(0, HumanEval_66.digitSum(""));
    }
}
// End of Test
