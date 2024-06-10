package com.example;



import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HumanEval_120Test {

    @Test
    public void test_0() {
        HumanEval_120 obj = new HumanEval_120();
        assertEquals(Arrays.asList(-4, -3, 5), obj.maximum(new int[]{-3, -4, 5}, 3));
    }

    @Test
    public void test_1() {
        HumanEval_120 obj = new HumanEval_120();
        assertEquals(Arrays.asList(4, 4), obj.maximum(new int[]{4, -4, 4}, 2));
    }
    
    @Test
    public void test_2() {
        HumanEval_120 obj = new HumanEval_120();
        assertEquals(Arrays.asList(2), obj.maximum(new int[]{-3, 2, 1, 2, -1, -2, 1}, 1));
    }

    // Similarly, add other tests here.

}


