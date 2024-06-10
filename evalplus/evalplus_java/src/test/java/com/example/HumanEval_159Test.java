package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import com.example.HumanEval_159;

public class HumanEval_159Test {

    @Test
    public void test_0() {
        assertArrayEquals(new int[] {11, 4}, HumanEval_159.eat(5, 6, 10));
    }

    @Test
    public void test_1() {
        assertArrayEquals(new int[] {12, 1}, HumanEval_159.eat(4, 8, 9));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new int[] {11, 0}, HumanEval_159.eat(1, 10, 10));
    }

    @Test
    public void test_3() {
        assertArrayEquals(new int[] {7, 0}, HumanEval_159.eat(2, 11, 5));
    }

    @Test
    public void test_4() {
        assertArrayEquals(new int[] {9, 2}, HumanEval_159.eat(4, 5, 7));
    }
    
    @Test
    public void test_5() {
        assertArrayEquals(new int[] {5, 0}, HumanEval_159.eat(4, 5, 1));
    }
    
    @Test
    public void test_6() {
        assertArrayEquals(new int[] {0, 0}, HumanEval_159.eat(0, 0, 0));
    }
    
    @Test
    public void test_7() {
        assertArrayEquals(new int[] {5, 0}, HumanEval_159.eat(0, 10, 5));
    }
    
    @Test
    public void test_8() {
        assertArrayEquals(new int[] {4, 0}, HumanEval_159.eat(2, 2, 2));
    }
    
    @Test
    public void test_9() {
        assertArrayEquals(new int[] {1002, 0}, HumanEval_159.eat(998, 7, 4));
    }
    
    @Test
    public void test_10() {
        assertArrayEquals(new int[] {1004, 495}, HumanEval_159.eat(999, 5, 500));
    }
    
    @Test
    public void test_11() {
        assertArrayEquals(new int[] {999, 0}, HumanEval_159.eat(999, 1, 0));
    }
}
// End of Test
