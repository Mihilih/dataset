package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HumanEval_29Test {

    @Test
    public void testFilterByPrefix0() {
//        assertEquals(Collections.emptyList(), HumanEval_29.filterByPrefix(Collections.emptyList(), "john"));
    }

    @Test
    public void testFilterByPrefix1() {
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), HumanEval_29.filterByPrefix(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));
    }

    @Test
    public void testFilterByPrefix2() {
        assertEquals(Arrays.asList("abc", "abcd", "abcde"), HumanEval_29.filterByPrefix(Arrays.asList("abc", "abcd", "abcde"), "abc"));
    }

    @Test
    public void testFilterByPrefix3() {
        assertEquals(Arrays.asList("qwerty", "qwertyuiop"), HumanEval_29.filterByPrefix(Arrays.asList("qwerty", "QwertY", "qwertyuiop", "QWERTYUIOP", "asdfgh", "ASDFGH", "as fgh", "ASD FGH"), "qwe"));
    }

    @Test
    public void testFilterByPrefix4() {
        assertEquals(Arrays.asList("a", "p", "r", "i", "c", "c", "o", "t"), HumanEval_29.filterByPrefix(Arrays.asList("apriccot".split("")), ""));
    }

    @Test
    public void testFilterByPrefix5() {
        assertEquals(Arrays.asList("a", "ab", "abc"), HumanEval_29.filterByPrefix(Arrays.asList("a", "ab", "abc", "ba", "bb", "bc"), "a"));
    }

    @Test
    public void testFilterByPrefix6() {
        assertEquals(Collections.emptyList(), HumanEval_29.filterByPrefix(Arrays.asList("".split("")), "aa"));
    }

    @Test
    public void testFilterByPrefix7() {
        assertEquals(Arrays.asList("", " ", "\n", "\t", "a", "ab", "abc", "abcde"), HumanEval_29.filterByPrefix(Arrays.asList("", " ", "\n", "\t", "a", "ab", "abc", "abcde"), ""));
    }

    @Test
    public void testFilterByPrefix8() {
        assertEquals(Arrays.asList("ASDFGH"), HumanEval_29.filterByPrefix(Arrays.asList("qwerty", "QwertY", "qwertyuiop", "QWERTYUIOP", "asdfgh", "ASDFGH", "as fgh", "ASD FGH"), "ASDFGH"));
    }

    @Test
    public void testFilterByPrefix9() {
        assertEquals(Collections.emptyList(), HumanEval_29.filterByPrefix(Arrays.asList("f".split("")), " "));
    }

    @Test
    public void testFilterByPrefix10() {
        assertEquals(Arrays.asList("zzz", "zzz", "zzz"), HumanEval_29.filterByPrefix(Arrays.asList("zzz", "zzz", "zzz"), "z"));
    }
}

// End of Test
