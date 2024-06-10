package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_118Test {

    @Test
    public void testGetClosestVowel1() {
        assertEquals("u", HumanEval_118.getClosestVowel("yogurt"));
    }

    @Test
    public void testGetClosestVowel2() {
        assertEquals("U", HumanEval_118.getClosestVowel("FULL"));
    }

    @Test
    public void testGetClosestVowel3() {
        assertEquals("", HumanEval_118.getClosestVowel("quick"));
    }

    @Test
    public void testGetClosestVowel4() {
        assertEquals("", HumanEval_118.getClosestVowel("ab"));
    }
    
    // Add more tests here

    @Test
    public void testGetClosestVowel5() {
        assertEquals("i", HumanEval_118.getClosestVowel("anime"));
    }

    @Test
    public void testGetClosestVowel6() {
        assertEquals("", HumanEval_118.getClosestVowel("Asia"));
    }

    @Test
    public void testGetClosestVowel7() {
        assertEquals("o", HumanEval_118.getClosestVowel("Above"));
    }

    @Test
    public void testGetClosestVowel8() {
        assertEquals("e", HumanEval_118.getClosestVowel("hello"));
    }

    @Test
    public void testGetClosestVowel9() {
        assertEquals("", HumanEval_118.getClosestVowel("try"));
    }

    @Test
    public void testGetClosestVowel10() {
        assertEquals("i", HumanEval_118.getClosestVowel("bbkrtiyyiuykooxnne"));
    }

    // Continue adding more tests here

}
// End of Test

