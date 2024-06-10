package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_98;

public class HumanEval_98Test {

    @Test
    public void testCountUpper0() {
        assertEquals(1, HumanEval_98.count_upper("aBCdEf"));
    }

    @Test
    public void testCountUpper1() {
        assertEquals(0, HumanEval_98.count_upper("abcdefg"));
    }

    @Test
    public void testCountUpper2() {
        assertEquals(0, HumanEval_98.count_upper("dBBE"));
    }

    @Test
    public void testCountUpper3() {
        assertEquals(0, HumanEval_98.count_upper("B"));
    }

    @Test
    public void testCountUpper4() {
        assertEquals(1, HumanEval_98.count_upper("U"));
    }

    @Test
    public void testCountUpper5() {
        assertEquals(0, HumanEval_98.count_upper(""));
    }

    @Test
    public void testCountUpper6() {
        assertEquals(2, HumanEval_98.count_upper("EEEE"));
    }

    @Test
    public void testCountUpper7() {
        assertEquals(1, HumanEval_98.count_upper("abcDEf"));
    }

    @Test
    public void testCountUpper8() {
        assertEquals(0, HumanEval_98.count_upper("DbdOH"));
    }

    @Test
    public void testCountUpper9() {
        assertEquals(2, HumanEval_98.count_upper("zbvuyrwqpmlkjhgfedcbaZXJUTSRPONMLKI"));
    }

    @Test
    public void testCountUpper10() {
        assertEquals(13, HumanEval_98.count_upper("AfbCdEOhhEEAbCdEIfGhIjKlabcDEfMnOpQrStUvWxYzrrRRStUvWxCDbdOHUOIEAABCDYz"));
    }

    @Test
    public void testCountUpper11() {
        assertEquals(1, HumanEval_98.count_upper("A"));
    }

    @Test
    public void testCountUpper12() {
        assertEquals(0, HumanEval_98.count_upper("uEi"));
    }

    @Test
    public void testCountUpper13() {
        assertEquals(0, HumanEval_98.count_upper(""));
    }

    @Test
    public void testCountUpper14() {
        assertEquals(0, HumanEval_98.count_upper("z"));
    }
}
// End of Test
