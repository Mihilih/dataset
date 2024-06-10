package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_16Test {
    
    @Test
    public void testCountDistinctCharacters0() {
        assertEquals(0, HumanEval_16.countDistinctCharacters(""));
    }

    @Test
    public void testCountDistinctCharacters1() {
        assertEquals(5, HumanEval_16.countDistinctCharacters("abcde"));
    }

    @Test
    public void testCountDistinctCharacters2() {
        assertEquals(5, HumanEval_16.countDistinctCharacters("abcdecadeCADE"));
    }

    @Test
    public void testCountDistinctCharacters3() {
        assertEquals(1, HumanEval_16.countDistinctCharacters("aaaaAAAAaaaa"));
    }

    @Test
    public void testCountDistinctCharacters4() {
        assertEquals(5, HumanEval_16.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }

    @Test
    public void testCountDistinctCharacters5() {
        assertEquals(27, HumanEval_16.countDistinctCharacters("hello wThe quick brown fox jumps over e lazy doAbCdEfGgorld"));
    }

    @Test
    public void testCountDistinctCharacters6() {
        assertEquals(45, HumanEval_16.countDistinctCharacters("!.\"£$%^rQXXQxau&*()_+-={}[1234567890\",]|\\:;\"<>,.?/^~`"));
    }

    @Test
    public void testCountDistinctCharacters7() {
        assertEquals(0, HumanEval_16.countDistinctCharacters(""));
    }

    @Test
    public void testCountDistinctCharacters8() {
        assertEquals(1, HumanEval_16.countDistinctCharacters("a"));
    }
}

// End of Test
