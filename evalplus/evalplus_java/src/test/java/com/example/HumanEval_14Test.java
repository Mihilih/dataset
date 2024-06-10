package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class HumanEval_14Test {
    
    @Test
    public void testAllPrefixes_0() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, HumanEval_14.allPrefixes(""));
    }

    @Test
    public void testAllPrefixes_1() {
        List<String> expected = Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh");
        assertEquals(expected, HumanEval_14.allPrefixes("asdfgh"));
    }

    @Test
    public void testAllPrefixes_2() {
        List<String> expected = Arrays.asList("W", "WW", "WWW");
        assertEquals(expected, HumanEval_14.allPrefixes("WWW"));
    }

    @Test
    public void testAllPrefixes_3() {
        List<String> expected = Arrays.asList("H", "He", "Hel", "Hell", "Hello", "Hello ", "Hello t", "Hello th", "Hello the", "Hello ther", "Hello there", "Hello there!");
        assertEquals(expected, HumanEval_14.allPrefixes("Hello there!"));
    }

    @Test
    public void testAllPrefixes_4() {
        List<String> expected = Arrays.asList("r", "ra", "rac", "race", "racec", "racecH", "racecHe", "racecHel", "racecHell", "racecHello", "racecHello ", "racecHello t", "racecHello th", "racecHello the", "racecHello ther", "racecHello therr", "racecHello therre", "racecHello therre!", "racecHello therre!a", "racecHello therre!ar");
        assertEquals(expected, HumanEval_14.allPrefixes("racecHello therre!ar"));
    }

    @Test
    public void testAllPrefixes_5() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, HumanEval_14.allPrefixes(""));
    }

    @Test
    public void testAllPrefixes_6() {
        List<String> expected = Arrays.asList("n");
        assertEquals(expected, HumanEval_14.allPrefixes("n"));
    }

    @Test
    public void testAllPrefixes_7() {
        List<String> expected = Arrays.asList("x", "xx");
        assertEquals(expected, HumanEval_14.allPrefixes("xx"));
    }
}
// End of Test
