package com.example;
// Here is your translated Python tests to Java Junit tests:


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Map;
import java.util.HashMap;

public class HumanEval_111Test {
  
    @Test
    public void testHistogram_0() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("a", 2);
            put("b", 2);
        }};
        assertEquals(expected, HumanEval_111.histogram("a b b a"));
    }

    @Test
    public void testHistogram_1() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("a", 2);
            put("b", 2);
        }};
        assertEquals(expected, HumanEval_111.histogram("a b c a b"));
    }

    @Test
    public void testHistogram_2() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("a", 1);
            put("b", 1);
            put("c", 1);
            put("d", 1);
            put("g", 1);
        }};
        assertEquals(expected, HumanEval_111.histogram("a b c d g"));
    }

    @Test
    public void testHistogram_3() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("r", 1);
            put("t", 1);
            put("g", 1);
        }};
        assertEquals(expected, HumanEval_111.histogram("r t g"));
    }

    @Test
    public void testHistogram_4() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("b", 4);
        }};
        assertEquals(expected, HumanEval_111.histogram("b b b b a"));
    }

    @Test
    public void testHistogram_5() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("r", 1);
            put("t", 1);
            put("g", 1);
        }};
        assertEquals(expected, HumanEval_111.histogram("r t g"));
    }

    @Test
    public void testHistogram_6() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, HumanEval_111.histogram(""));
    }

    @Test
    public void testHistogram_7() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("a", 1);
        }};
        assertEquals(expected, HumanEval_111.histogram("a"));
    }

    @Test
    public void testHistogram_8() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("b", 5);
        }};
        assertEquals(expected, HumanEval_111.histogram("a b b b b b"));
    }

    @Test
    public void testHistogram_9() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, HumanEval_111.histogram(""));
    }

    @Test
    public void testHistogram_10() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("o", 4);
        }};
        assertEquals(expected, HumanEval_111.histogram("h i j j k l m m m n o o o o p"));
    }

    @Test
    public void testHistogram_11() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("j", 2);
            put("o", 2);
        }};
        assertEquals(expected, HumanEval_111.histogram("h i j j k l m o o p"));
    }

    @Test
    public void testHistogram_12() {
        Map<String, Integer> expected = new HashMap<>() {{
            put("x", 3);
        }};
        assertEquals(expected, HumanEval_111.histogram("x y z x y z x"));
    }
}

// End of Test
