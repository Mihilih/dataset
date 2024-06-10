package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HumanEval_1Test {

    @Test
    public void testCase0() {
        List<String> expected = Arrays.asList("(()())", "((()))", "()", "((())()())");
        assertEquals(expected, HumanEval_1.separateParenGroups("(()()) ((())) () ((())()())"));
    }

    @Test
    public void testCase1() {
        List<String> expected = Arrays.asList("()", "(())", "((()))", "(((())))");
        assertEquals(expected, HumanEval_1.separateParenGroups("() (()) ((())) (((())))"));
    }

    @Test
    public void testCase2() {
        List<String> expected = Arrays.asList("(()(())((())))");
        assertEquals(expected, HumanEval_1.separateParenGroups("(()(())((())))"));
    }

    @Test
    public void testCase3() {
        List<String> expected = Arrays.asList("()", "(())", "(()())");
        assertEquals(expected, HumanEval_1.separateParenGroups("( ) (( )) (( )( ))"));
    }

    @Test
    public void testCase4() {
        List<String> expected = Arrays.asList("()");
        assertEquals(expected, HumanEval_1.separateParenGroups("()"));
    }

    @Test
    public void testCase5() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, HumanEval_1.separateParenGroups("(((()(()())())"));
    }

    @Test
    public void testCase6() {
        List<String> expected = Arrays.asList("((()((()()(((((()))))))()()))", "(()(()))", "()", "(()())");
        assertEquals(expected, HumanEval_1.separateParenGroups("((() ((()()((((((  )))))))()()))) (()(()))()(()())"));
    }

    @Test
    public void testCase7() {
        List<String> expected = Arrays.asList("(((())))", "()");
        assertEquals(expected, HumanEval_1.separateParenGroups("(((())))()((((((()(()()((())))(())))()(((())))()((()()))((()())))()))(())((()()))"));
    }

    @Test
    public void testCase8() {
        List<String> expected = Arrays.asList("()", "(())", "(()())", "()", "()", "()");
        assertEquals(expected, HumanEval_1.separateParenGroups("( ) (( )) (( )( ))       ()()()"));
    }
}
// End of Test
