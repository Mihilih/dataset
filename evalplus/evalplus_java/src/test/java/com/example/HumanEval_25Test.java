package com.example;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class HumanEval_25Test {

    @Test
    public void testFactorize_0() {
        assertEquals(Arrays.asList(2), HumanEval_25.factorize(2));
    }

    @Test
    public void testFactorize_1() {
        assertEquals(Arrays.asList(2, 2), HumanEval_25.factorize(4));
    }

    @Test
    public void testFactorize_2() {
        assertEquals(Arrays.asList(2, 2, 2), HumanEval_25.factorize(8));
    }

    @Test
    public void testFactorize_3() {
        assertEquals(Arrays.asList(3, 19), HumanEval_25.factorize(57));
    }

    @Test
    public void testFactorize_4() {
        assertEquals(Arrays.asList(3, 3, 19, 19), HumanEval_25.factorize(3249));
    }

    @Test
    public void testFactorize_5() {
        assertEquals(Arrays.asList(3, 3, 3, 19, 19, 19), HumanEval_25.factorize(185193));
    }

    @Test
    public void testFactorize_6() {
        assertEquals(Arrays.asList(3, 19, 19, 19), HumanEval_25.factorize(20577));
    }

    @Test
    public void testFactorize_7() {
        assertEquals(Arrays.asList(2, 3, 3), HumanEval_25.factorize(18));
    }

    @Test
    public void testFactorize_8() {
        assertEquals(Arrays.asList(2, 5), HumanEval_25.factorize(10));
    }

    @Test
    public void testFactorize_9() {
        assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2), HumanEval_25.factorize(1024));
    }

    @Test
    public void testFactorize_10() {
        assertEquals(Arrays.asList(3, 5), HumanEval_25.factorize(15));
    }

    @Test
    public void testFactorize_11() {
        assertEquals(Arrays.asList(3, 3, 17, 17, 379721), HumanEval_25.factorize(987654321));
    }

    @Test
    public void testFactorize_12() {
        assertEquals(Arrays.asList(2, 2, 28058593), HumanEval_25.factorize(112234372));
    }

    @Test
    public void testFactorize_13() {
        assertEquals(Arrays.asList(3, 3, 3607, 3803), HumanEval_25.factorize(123456789));
    }

    @Test
    public void testFactorize_14() {
        assertEquals(Arrays.asList(11), HumanEval_25.factorize(11));
    }
}
// End of Test
