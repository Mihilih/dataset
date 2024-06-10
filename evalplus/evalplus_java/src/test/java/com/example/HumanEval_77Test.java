package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_77Test {

    @Test
    public void testIsCube1() {
        assertEquals(true, HumanEval_77.isCube(1));
    }

    @Test
    public void testIsCube2() {
        assertEquals(false, HumanEval_77.isCube(2));
    }

    @Test
    public void testIsCubeNegative1() {
        assertEquals(true, HumanEval_77.isCube(-1));
    }

    @Test
    public void testIsCube64() {
        assertEquals(true, HumanEval_77.isCube(64));
    }

    @Test
    public void testIsCube0() {
        assertEquals(true, HumanEval_77.isCube(0));
    }

    @Test
    public void testIsCube180() {
        assertEquals(false, HumanEval_77.isCube(180));
    }

    @Test
    public void testIsCube1000() {
        assertEquals(true, HumanEval_77.isCube(1000));
    }

    @Test
    public void testIsCube1729() {
        assertEquals(false, HumanEval_77.isCube(1729));
    }

    @Test
    public void testIsCube1728() {
        assertEquals(true, HumanEval_77.isCube(1728));
    }

    @Test
    public void testIsCube27() {
        assertEquals(true, HumanEval_77.isCube(27));
    }

    @Test
    public void testIsCubeNegative64() {
        assertEquals(true, HumanEval_77.isCube(-64));
    }
    
    @Test
    public void testIsCubeNegativeMax() {
        assertEquals(false, HumanEval_77.isCube(Integer.MIN_VALUE));
    }
    
    @Test
    public void testIsCubeNegativeLarge() {
        assertEquals(false, HumanEval_77.isCube(-999999));
    }
}

// End of Test
