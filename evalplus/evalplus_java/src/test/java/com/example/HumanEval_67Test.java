package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_67Test {
    
    @Test
    public void testFruitDistribution1() {
        assertEquals(8, HumanEval_67.fruitDistribution("5 apples and 6 oranges", 19));
    }
    
    @Test
    public void testFruitDistribution2() {
        assertEquals(10, HumanEval_67.fruitDistribution("5 apples and 6 oranges", 21));
    }

    @Test
    public void testFruitDistribution3() {
        assertEquals(2, HumanEval_67.fruitDistribution("0 apples and 1 oranges", 3));
    }

    @Test
    public void testFruitDistribution4() {
        assertEquals(2, HumanEval_67.fruitDistribution("1 apples and 0 oranges", 3));
    }

    @Test
    public void testFruitDistribution5() {
        assertEquals(95, HumanEval_67.fruitDistribution("2 apples and 3 oranges", 100));
    }

    @Test
    public void testFruitDistribution6() {
        assertEquals(0, HumanEval_67.fruitDistribution("2 apples and 3 oranges", 5));
    }

    @Test
    public void testFruitDistribution7() {
        assertEquals(19, HumanEval_67.fruitDistribution("1 apples and 100 oranges", 120));
    }
    
    @Test
    public void testFruitDistribution8() {
        assertEquals(0, HumanEval_67.fruitDistribution("10 apples and 20 oranges", 30));
    }

    @Test
    public void testFruitDistribution9() {
        assertEquals(21, HumanEval_67.fruitDistribution("10 apples and 20 oranges", 51));
    }

    @Test
    public void testFruitDistribution10() {
        assertEquals(20, HumanEval_67.fruitDistribution("10 apples and 20 oranges", 50));
    }
    
    @Test
    public void testFruitDistribution11() {
        assertEquals(10, HumanEval_67.fruitDistribution("0 apples and 0 oranges", 10));
    }
}
// End of Test
