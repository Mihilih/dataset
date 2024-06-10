package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import com.example.HumanEval_78;

public class HumanEval_78Test {
    HumanEval_78 hexKey = new HumanEval_78();

    @Test
    public void test_0() {
        assertEquals(1, hexKey.hexKey("AB"));
    }

    @Test
    public void test_1() {
        assertEquals(1, hexKey.hexKey("AB"));
    }

    @Test
    public void test_2() {
        assertEquals(2, hexKey.hexKey("1077E"));
    }

    @Test
    public void test_3() {
        assertEquals(2, hexKey.hexKey("1077E"));
    }

    @Test
    public void test_4() {
        assertEquals(4, hexKey.hexKey("ABED1A33"));
    }

    @Test
    public void test_5() {
        assertEquals(4, hexKey.hexKey("ABED1A33"));
    }

    @Test
    public void test_6() {
        assertEquals(2, hexKey.hexKey("2020"));
    }

    @Test
    public void test_7() {
        assertEquals(2, hexKey.hexKey("2020"));
    }

    @Test
    public void test_8() {
        assertEquals(6, hexKey.hexKey("123456789ABCDEF0"));
    }

    @Test
    public void test_9() {
        assertEquals(6, hexKey.hexKey("123456789ABCDEF0"));
    }

    @Test
    public void test_10() {
        assertEquals(12, hexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
    }

    @Test
    public void test_11() {
        assertEquals(12, hexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
    }

    @Test
    public void test_12() {
        assertEquals(0, hexKey.hexKey(""));
    }

    @Test
    public void test_13() {
        assertEquals(2, hexKey.hexKey("ABCDEF"));
    }

    @Test
    public void test_14() {
        assertEquals(33, hexKey.hexKey("ACDF12345B67C2022EEEFAD890ABCDEF12345BBAA202001111887215E753BD9CEFF23BCCBBD4"));
    }

    @Test
    public void test_15() {
        assertEquals(0, hexKey.hexKey(""));
    }

    @Test
    public void test_16() {
        assertEquals(5, hexKey.hexKey("67ABCD23"));
    }

    @Test
    public void test_17() {
        assertEquals(6, hexKey.hexKey("11111777777"));
    }

    @Test
    public void test_18() {
        assertEquals(6, hexKey.hexKey("679D99999ABCD23"));
    }

    @Test
    public void test_19() {
        assertEquals(0, hexKey.hexKey("1"));
    }
}
// End of Test
