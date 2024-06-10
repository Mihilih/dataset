package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_112Test {
    
    @Test
    public void test_0() {
        Object[] result = HumanEval_112.reverse_delete("abcde", "ae");
        assertEquals("bcd", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_1() {
        Object[] result = HumanEval_112.reverse_delete("abcdef", "b");
        assertEquals("acdef", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_2() {
        Object[] result = HumanEval_112.reverse_delete("abcdedcba", "ab");
        assertEquals("cdedc", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_3() {
        Object[] result = HumanEval_112.reverse_delete("dwik", "w");
        assertEquals("dik", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_4() {
        Object[] result = HumanEval_112.reverse_delete("a", "a");
        assertEquals("", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_5() {
        Object[] result = HumanEval_112.reverse_delete("abcdedcba", "");
        assertEquals("abcdedcba", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_6() {
        Object[] result = HumanEval_112.reverse_delete("abcdedcba", "v");
        assertEquals("abcdedcba", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_7() {
        Object[] result = HumanEval_112.reverse_delete("vabba", "v");
        assertEquals("abba", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_8() {
        Object[] result = HumanEval_112.reverse_delete("mamma", "mia");
        assertEquals("", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_9() {
        Object[] result = HumanEval_112.reverse_delete("racecar", "ace");
        assertEquals("rr", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_10() {
        Object[] result = HumanEval_112.reverse_delete("bc", "ervee");
        assertEquals("bc", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_11() {
        Object[] result = HumanEval_112.reverse_delete("dveeifieacced", "dveeified");
        assertEquals("acc", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_12() {
        Object[] result = HumanEval_112.reverse_delete("ave", "ve");
        assertEquals("a", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_13() {
        Object[] result = HumanEval_112.reverse_delete("", "ve");
        assertEquals("", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_14() {
        Object[] result = HumanEval_112.reverse_delete("ne", "");
        assertEquals("ne", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_15() {
        Object[] result = HumanEval_112.reverse_delete("XtMIzX", "xllmeyz");
        assertEquals("XtMIX", result[0]);
        assertEquals(false, result[1]);
    }

    @Test
    public void test_16() {
        Object[] result = HumanEval_112.reverse_delete("level", "ve");
        assertEquals("ll", result[0]);
        assertEquals(true, result[1]);
    }

    @Test
    public void test_17() {
        Object[] result = HumanEval_112.reverse_delete("radar", "");
        assertEquals("radar", result[0]);
        assertEquals(true, result[1]);
    }
}
// End of Test
