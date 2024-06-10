package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class HumanEval_160Test {

    @Test
    public void testDoAlgebra1() {
        assertEquals(37, HumanEval_160.doAlgebra(Arrays.asList("**", "*", "+"), Arrays.asList(2, 3, 4, 5)));
    }
  
    @Test
    public void testDoAlgebra2() {
        assertEquals(9, HumanEval_160.doAlgebra(Arrays.asList("+", "*", "-"), Arrays.asList(2, 3, 4, 5)));
    }

    @Test
    public void testDoAlgebra3() {
        assertEquals(8, HumanEval_160.doAlgebra(Arrays.asList("//", "*"), Arrays.asList(7, 3, 4)));
    }

    @Test
    public void testDoAlgebra4() {
        assertEquals(6, HumanEval_160.doAlgebra(Arrays.asList("+", "-", "*", "//"), Arrays.asList(5, 2, 3, 4, 7)));
    }

    @Test
    public void testDoAlgebra5() {
        assertEquals(28, HumanEval_160.doAlgebra(Arrays.asList("-", "//", "+", "*"), Arrays.asList(10, 2, 4, 3, 6)));
    }
}

