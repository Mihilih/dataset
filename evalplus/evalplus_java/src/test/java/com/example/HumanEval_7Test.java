package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_7Test {

    @Test
    public void testFilterBySubstring0() {
        assertEquals(new ArrayList<>(), HumanEval_7.filterBySubstring(new ArrayList<String>(), "john"));
    }

    @Test
    public void testFilterBySubstring1() {
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), HumanEval_7.filterBySubstring(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx"), "xxx"));
    }

    @Test
    public void testFilterBySubstring2() {
        assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), HumanEval_7.filterBySubstring(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx"), "xx"));
    }

    @Test
    public void testFilterBySubstring3() {
        assertEquals(Arrays.asList("grunt", "prune"), HumanEval_7.filterBySubstring(Arrays.asList("grunt", "trumpet", "prune", "gruesome"), "run"));
    }

    @Test
    public void testFilterBySubstring4() {
        assertEquals(Arrays.asList("banana", "apple", "peach"), HumanEval_7.filterBySubstring(Arrays.asList("banana", "apple", "kiwi", "peach"), "a"));
    }

    @Test
    public void testFilterBySubstring5() {
        assertEquals(Arrays.asList("San Francisco"), HumanEval_7.filterBySubstring(Arrays.asList("Washington", "DC", "New York City", "Boston", "Los Angeles", "San Francisco", "Miami"), "an"));
    }

    @Test
    public void testFilterBySubstring6() {
        assertEquals(Arrays.asList("", "", ""), HumanEval_7.filterBySubstring(Arrays.asList("", "", ""), ""));
    }

    @Test
    public void testFilterBySubstring7() {
        assertEquals(new ArrayList<>(), HumanEval_7.filterBySubstring(Arrays.asList("abcdefg"), "universally"));
    }

    @Test
    public void testFilterBySubstring8() {
        assertEquals(Arrays.asList("The Shawshank Redemption", " The Godfather ", "The Dark Knight", "  The Lord of the Rings   ", "   Star Wars", " Inception     ", "Forrest Gump"), 
                     HumanEval_7.filterBySubstring(Arrays.asList("The Shawshank Redemption", " The Godfather ", "The Dark Knight", "  The Lord of the Rings   ", "   Star Wars", " Inception     ", "Forrest Gump"), " "));
    }

    @Test
    public void testFilterBySubstring9() {
        assertEquals(Arrays.asList("fom"), HumanEval_7.filterBySubstring(Arrays.asList("fom", "abcdefg"), "fom"));
    }

    @Test
    public void testFilterBySubstring10() {
        assertEquals(Arrays.asList("New York City"), HumanEval_7.filterBySubstring(Arrays.asList("Washington", "DC", "New York City", "Boston", "Los Angeles", "San Francisco", "Miami"), "York"));
    }
}
// End of Test
