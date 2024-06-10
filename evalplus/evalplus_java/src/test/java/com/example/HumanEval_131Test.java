package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.HumanEval_131;

public class HumanEval_131Test {

    @Test
    public void testDigits_0() {
        assertEquals(5, HumanEval_131.digits(5));
    }

    @Test
    public void testDigits_1() {
        assertEquals(5, HumanEval_131.digits(54));
    }

    @Test
    public void testDigits_2() {
        assertEquals(1, HumanEval_131.digits(120));
    }

    @Test
    public void testDigits_3() {
        assertEquals(5, HumanEval_131.digits(5014));
    }

    @Test
    public void testDigits_4() {
        assertEquals(315, HumanEval_131.digits(98765));
    }

    @Test
    public void testDigits_5() {
        assertEquals(2625, HumanEval_131.digits(5576543));
    }

    @Test
    public void testDigits_6() {
        assertEquals(0, HumanEval_131.digits(2468));
    }
    
    @Test
    public void testDigits_7() {
        assertEquals(15, HumanEval_131.digits(182135));
    }
    
    @Test
    public void testDigits_8() {
        assertEquals(0, HumanEval_131.digits(246));
    }
    
    @Test
    public void testDigits_9() {
        assertEquals(45, HumanEval_131.digits(951));
    }
    
    @Test
    public void testDigits_10() {
        assertEquals(45, HumanEval_131.digits(952));
    }
    
    @Test
    public void testDigits_11() {
        assertEquals(1, HumanEval_131.digits(241));
    }
}
// End of Test
