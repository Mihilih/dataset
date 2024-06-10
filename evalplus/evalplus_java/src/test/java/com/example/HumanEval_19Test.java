package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_19;

public class HumanEval_19Test {
    
    @Test
    public void testSortNumbers_0() {
        assertEquals("", HumanEval_19.sortNumbers(""));
    }
    
    @Test
    public void testSortNumbers_1() {
        assertEquals("three", HumanEval_19.sortNumbers("three"));
    }

    @Test
    public void testSortNumbers_2() {
        assertEquals("three five nine", HumanEval_19.sortNumbers("three five nine"));
    }

    @Test
    public void testSortNumbers_3() {
        assertEquals("zero four five seven eight nine", HumanEval_19.sortNumbers("five zero four seven nine eight"));
    }

    @Test
    public void testSortNumbers_4() {
        assertEquals("zero one two three four five six", HumanEval_19.sortNumbers("six five four three two one zero"));
    }

    @Test
    public void testSortNumbers_5() {
        assertEquals("two four eight", HumanEval_19.sortNumbers("four eight two"));
    }

    @Test
    public void testSortNumbers_6() {
        assertEquals("", HumanEval_19.sortNumbers(""));
    }

    @Test
    public void testSortNumbers_7() {
        assertEquals("zero one two three four five six seven eight nine", HumanEval_19.sortNumbers("nine eight seven six five four three two one zero"));
    }

    @Test
    public void testSortNumbers_8() {
        assertEquals("zero zero one two four four five five six seven eight", HumanEval_19.sortNumbers("zero five four zero five four one seven eight two six"));
    }

    @Test
    public void testSortNumbers_9() {
        assertEquals("nine", HumanEval_19.sortNumbers("nine"));
    }
}
// End of Test.
