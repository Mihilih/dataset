package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_148Test {
    @Test
    public void test_0() {
        assertArrayEquals(new String[]{"Saturn", "Uranus"}, HumanEval_148.bf("Jupiter", "Neptune"));
    }
    @Test
    public void test_1() {
        assertArrayEquals(new String[]{"Venus"}, HumanEval_148.bf("Earth", "Mercury"));
    }
    @Test
    public void test_2() {
        assertArrayEquals(new String[]{"Venus", "Earth", "Mars", "Jupiter", "Saturn"}, HumanEval_148.bf("Mercury", "Uranus"));
    }
    @Test
    public void test_3() {
        assertArrayEquals(new String[]{"Earth", "Mars", "Jupiter", "Saturn", "Uranus"}, HumanEval_148.bf("Neptune", "Venus"));
    }
    @Test
    public void test_4() {
        assertArrayEquals(new String[]{}, HumanEval_148.bf("Earth", "Earth"));
    }
    @Test
    public void test_5() {
        assertArrayEquals(new String[]{}, HumanEval_148.bf("Mars", "Earth"));
    }
    @Test
    public void test_6() {
        assertArrayEquals(new String[]{}, HumanEval_148.bf("Jupiter", "Makemake"));
    }
}
// End of Test
