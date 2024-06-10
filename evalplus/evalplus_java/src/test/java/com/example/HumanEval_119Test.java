package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_119;

public class HumanEval_119Test {
    
    @Test
    public void test_0() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{"()(", ")"}));
    }

    @Test
    public void test_1() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{")", ")"}));
    }

    @Test
    public void test_2() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"(()(())", "())())"}));
    }

    @Test
    public void test_3() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{")())", "(()()("}));
    }

    @Test
    public void test_4() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{"(())))", "(()())(("}));
    }

    @Test
    public void test_5() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"()", "())"}));
    }

    @Test
    public void test_6() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{"(()(", "()))()"}));
    }

    @Test
    public void test_7() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"((((", "((())"}));
    }

    @Test
    public void test_8() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{")(()", "(()("}));
    }

    @Test
    public void test_9() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{")(", ")("}));
    }

    @Test
    public void test_10() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{"(", ")"}));
    }

    @Test
    public void test_11() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{")", "("}));
    }

    @Test
    public void test_12() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"(", "()())("}));
    }

    @Test
    public void test_13() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"))", "))"}));
    }

    @Test
    public void test_14() {
        assertEquals("Yes", HumanEval_119.matchParens(new String[]{")()()()(()()))", "(("}));
    }

    @Test
    public void test_15() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"())(", "()"}));
    }

    @Test
    public void test_16() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{"())))(", "(("}));
    }

    @Test
    public void test_17() {
        assertEquals("No", HumanEval_119.matchParens(new String[]{")()()()(()()))", "("}));
    }
}
// End of Test

