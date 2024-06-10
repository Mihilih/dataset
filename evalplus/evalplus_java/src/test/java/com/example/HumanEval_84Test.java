package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import com.example.HumanEval_84;

public class HumanEval_84Test {
    
    @Test
    public void testSolve_0() {
        assertEquals("1", HumanEval_84.solve(1000));
    }

    @Test
    public void testSolve_1() {
        assertEquals("110", HumanEval_84.solve(150));
    }

    @Test
    public void testSolve_2() {
        assertEquals("1100", HumanEval_84.solve(147));
    }

    @Test
    public void testSolve_3() {
        assertEquals("1001", HumanEval_84.solve(333));
    }

    @Test
    public void testSolve_4() {
        assertEquals("10010", HumanEval_84.solve(963));
    }

    @Test
    public void testSolve_5() {
        assertEquals("1", HumanEval_84.solve(1));
    }

    @Test
    public void testSolve_6() {
        assertEquals("100100", HumanEval_84.solve(9999));
    }

    @Test
    public void testSolve_7() {
        assertEquals("1", HumanEval_84.solve(10));
    }
}
// End of Test
