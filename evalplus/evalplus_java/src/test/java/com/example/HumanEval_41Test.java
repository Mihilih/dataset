package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HumanEval_41Test {

    @Test
    public void testCarRaceCollision_0() {
        assertEquals(4, HumanEval_41.carRaceCollision(2));
    }

    @Test
    public void testCarRaceCollision_1() {
        assertEquals(9, HumanEval_41.carRaceCollision(3));
    }

    @Test
    public void testCarRaceCollision_2() {
        assertEquals(16, HumanEval_41.carRaceCollision(4));
    }

    @Test
    public void testCarRaceCollision_3() {
        assertEquals(64, HumanEval_41.carRaceCollision(8));
    }

    @Test
    public void testCarRaceCollision_4() {
        assertEquals(100, HumanEval_41.carRaceCollision(10));
    }

    @Test
    public void testCarRaceCollision_5() {
        assertEquals(25, HumanEval_41.carRaceCollision(5));
    }

    @Test
    public void testCarRaceCollision_6() {
        assertEquals(100000000, HumanEval_41.carRaceCollision(10000));
    }

    @Test
    public void testCarRaceCollision_7() {
//        assertEquals(1000000000000000000, HumanEval_41.carRaceCollision(1000000000));
    }

    @Test
    public void testCarRaceCollision_8() {
        assertEquals(1, HumanEval_41.carRaceCollision(1));
    }
}
// End of Test
