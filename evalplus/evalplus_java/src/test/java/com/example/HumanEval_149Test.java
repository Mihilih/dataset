package com.example;

import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_149Test {
    @Test
    public void test_sortedListSum_0() {
        assertEquals(Arrays.asList("aa"), HumanEval_149.sortedListSum(Arrays.asList("aa", "a", "aaa")));
    }

    @Test
    public void test_sortedListSum_1() {
        assertEquals(Arrays.asList("AI", "asdf", "school"), HumanEval_149.sortedListSum(Arrays.asList("school", "AI", "asdf", "b")));
    }

    @Test
    public void test_sortedListSum_2() {
        assertEquals(Arrays.asList(), HumanEval_149.sortedListSum(Arrays.asList("d", "b", "c", "a")));
    }
    
    @Test
    public void test_sortedListSum_3() {
        assertEquals(Arrays.asList("abcd", "dcba"), HumanEval_149.sortedListSum(Arrays.asList("d", "dcba", "abcd", "a")));
    }
    
    @Test
    public void test_sortedListSum_4() {
        assertEquals(Arrays.asList("AI", "ai", "au"), HumanEval_149.sortedListSum(Arrays.asList("AI", "ai", "au")));
    }
    
    @Test
    public void test_sortedListSum_5() {
        assertEquals(Arrays.asList(), HumanEval_149.sortedListSum(Arrays.asList("a", "b", "b", "c", "c", "a")));
    }
    
    @Test
    public void test_sortedListSum_6() {
        assertEquals(Arrays.asList("cc", "dd", "aaaa", "bbbb"), HumanEval_149.sortedListSum(Arrays.asList("aaaa", "bbbb", "dd", "cc")));
    }
    
    @Test
    public void test_sortedListSum_7() {
        assertEquals(Arrays.asList("java", "ruby", "python"), HumanEval_149.sortedListSum(Arrays.asList("programming", "python", "java", "ruby")));
    }
    
    @Test
    public void test_sortedListSum_8() {
        assertEquals(Arrays.asList("is", "python", "language"), HumanEval_149.sortedListSum(Arrays.asList("python", "is", "a", "popular", "language")));
    }
    
    @Test
    public void test_sortedListSum_9() {
        assertEquals(Arrays.asList("is", "test", "this"), HumanEval_149.sortedListSum(Arrays.asList("hello", "world", "this", "is", "a", "test")));
    }
    
    @Test
    public void test_sortedListSum_10() {
        assertEquals(Arrays.asList("", "is", "popuolar", "poupular", "lizardpython"), HumanEval_149.sortedListSum(Arrays.asList("poupular", "popuolar", "lizardpython", "is", "", "popular", "jumps")));
    }
    
    @Test
    public void test_sortedListSum_11() {
        assertEquals(Arrays.asList("test", "this", "istest", "istest", "jumpshello", "telizardst"), HumanEval_149.sortedListSum(Arrays.asList("hello", "world", "this", "thiis", "jumpshello", "telizardst", "istest", "a", "test", "istest")));
    }
    
    @Test
    public void test_sortedListSum_12() {
        assertEquals(Arrays.asList(), HumanEval_149.sortedListSum(Arrays.asList("abcdefg")));
    }
}
// End of Test
