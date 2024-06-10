package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import com.example.HumanEval_107;

public class HumanEval_107Test {

    @Test
    public void testEvenOddPalindrome0() {
        assertArrayEquals(new int[]{8, 13}, HumanEval_107.evenOddPalindrome(123));
    }

    @Test
    public void testEvenOddPalindrome1() {
        assertArrayEquals(new int[]{4, 6}, HumanEval_107.evenOddPalindrome(12));
    }

    @Test
    public void testEvenOddPalindrome2() {
        assertArrayEquals(new int[]{1, 2}, HumanEval_107.evenOddPalindrome(3));
    }

    @Test
    public void testEvenOddPalindrome3() {
        assertArrayEquals(new int[]{6, 8}, HumanEval_107.evenOddPalindrome(63));
    }

    @Test
    public void testEvenOddPalindrome4() {
        assertArrayEquals(new int[]{5, 6}, HumanEval_107.evenOddPalindrome(25));
    }

    @Test
    public void testEvenOddPalindrome5() {
        assertArrayEquals(new int[]{4, 6}, HumanEval_107.evenOddPalindrome(19));
    }

    @Test
    public void testEvenOddPalindrome6() {
        assertArrayEquals(new int[]{4, 5}, HumanEval_107.evenOddPalindrome(9));
    }

    @Test
    public void testEvenOddPalindrome7() {
        assertArrayEquals(new int[]{0, 1}, HumanEval_107.evenOddPalindrome(1));
    }

    @Test
    public void testEvenOddPalindrome8() {
        assertArrayEquals(new int[]{48, 60}, HumanEval_107.evenOddPalindrome(1000));
    }

    @Test
    public void testEvenOddPalindrome9() {
        assertArrayEquals(new int[]{38, 48}, HumanEval_107.evenOddPalindrome(777));
    }

    @Test
    public void testEvenOddPalindrome10() {
        assertArrayEquals(new int[]{4, 4}, HumanEval_107.evenOddPalindrome(8));
    }
}
// End of Test
