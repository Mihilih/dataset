package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import com.example.HumanEval_6;

public class HumanEval_6Test {
    HumanEval_6 obj = new HumanEval_6();

    @Test
    public void test_0() {
        assertEquals(Arrays.asList(2, 3, 1, 3), obj.parseNestedParens("(()()) ((())) () ((())()())"));
    }

    @Test
    public void test_1() {
        assertEquals(Arrays.asList(1, 2, 3, 4), obj.parseNestedParens("() (()) ((())) (((())))"));
    }

    @Test
    public void test_2() {
        assertEquals(Arrays.asList(4), obj.parseNestedParens("(()(())((())))"));
    }

    @Test
    public void test_3() {
        assertEquals(Arrays.asList(3), obj.parseNestedParens("((()))"));
    }

    @Test
    public void test_4() {
        assertEquals(Arrays.asList(2, 0, 1, 0, 1, 1), obj.parseNestedParens("  (() )    ( )   (   ()()) "));
    }

    @Test
    public void test_5() {
        assertEquals(Arrays.asList(3), obj.parseNestedParens("(())(()(()))((()()))"));
    }

    @Test
    public void test_6() {
        assertEquals(Arrays.asList(4, 2, 3, 3), obj.parseNestedParens("()()(((())()) ()(()()) ((())) ((())())())"));
    }
}
// End of Test
