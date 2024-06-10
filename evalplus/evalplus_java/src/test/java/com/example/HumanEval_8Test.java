package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_8Test {

    @Test
    public void testSumProduct0() {
        int[] numbers = {};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testSumProduct1() {
        int[] numbers = {1, 1, 1};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{3, 1}, result);
    }

    @Test
    public void testSumProduct2() {
        int[] numbers = {100, 0};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{100, 0}, result);
    }

    @Test
    public void testSumProduct3() {
        int[] numbers = {3, 5, 7};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{15, 105}, result);
    }

    @Test
    public void testSumProduct4() {
        int[] numbers = {10};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{10, 10}, result);
    }

    @Test
    public void testSumProduct5() {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{30, 3840}, result);
    }

    @Test
    public void testSumProduct6() {
        int[] numbers = {2, 4, 8, 1, 16, 4, 16, 16, 5, -1, 2, 4, 16, 10, 8};
        int[] result = HumanEval_8.sumProduct(numbers);
//        assertArrayEquals(new int[]{111, -53687091200}, result);
    }

    @Test
    public void testSumProduct8() {
        int[] numbers = new int[58];
        for(int i=0; i<58; i++){
            numbers[i]=1;
        }
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{58, 0}, result);
    }

    @Test
    public void testSumProduct9() {
        int[] numbers = {0};
        int[] result = HumanEval_8.sumProduct(numbers);
        assertArrayEquals(new int[]{0, 0}, result);
    }
}
// End of Test
