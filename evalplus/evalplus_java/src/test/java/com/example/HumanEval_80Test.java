package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_80Test {
    @Test
    public void testIsHappy0() {
        assertEquals(false, HumanEval_80.isHappy("a"));
    }
    
    @Test
    public void testIsHappy1() {
        assertEquals(false, HumanEval_80.isHappy("aa"));
    }
    
    @Test
    public void testIsHappy2() {
        assertEquals(true, HumanEval_80.isHappy("abcd"));
    }
    
    @Test
    public void testIsHappy3() {
        assertEquals(false, HumanEval_80.isHappy("aabb"));
    }
    
    @Test
    public void testIsHappy4() {
        assertEquals(true, HumanEval_80.isHappy("adb"));
    }
    
    @Test
    public void testIsHappy5() {
        assertEquals(false, HumanEval_80.isHappy("xyy"));
    }
    
    @Test
    public void testIsHappy6() {
        assertEquals(true, HumanEval_80.isHappy("iopaxpoi"));
    }
    
    @Test
    public void testIsHappy7() {
        assertEquals(false, HumanEval_80.isHappy("iopaxioi"));
    }
    
    @Test
    public void testIsHappy8() {
        assertEquals(true, HumanEval_80.isHappy("xyz"));
    }
    
    @Test
    public void testIsHappy9() {
        assertEquals(false, HumanEval_80.isHappy("agbebf"));
    }
    
    @Test
    public void testIsHappy10() {
        assertEquals(false, HumanEval_80.isHappy("xy"));
    }
    
    @Test
    public void testIsHappy11() {
        assertEquals(false, HumanEval_80.isHappy("xxy"));
    }
    
    @Test
    public void testIsHappy12() {
        assertEquals(true, HumanEval_80.isHappy(" this is hb"));
    }
    
    @Test
    public void testIsHappy13() {
        assertEquals(false, HumanEval_80.isHappy("tibacacbacbm"));
    }
    
    @Test
    public void testIsHappy14() {
        assertEquals(false, HumanEval_80.isHappy("baUee"));
    }
    
    @Test
    public void testIsHappy15() {
        assertEquals(true, HumanEval_80.isHappy("abcdefghijklmde"));
    }
    
    @Test
    public void testIsHappy16() {
        assertEquals(true, HumanEval_80.isHappy("cabcabc"));
    }
    
    @Test
    public void testIsHappy17() {
        assertEquals(false, HumanEval_80.isHappy("bacacbacb"));
    }
    
    @Test
    public void testIsHappy18() {
        assertEquals(true, HumanEval_80.isHappy(" this is bat"));
    }
    
    @Test
    public void testIsHappy19() {
        assertEquals(false, HumanEval_80.isHappy("x"));
    }
    
    @Test
    public void testIsHappy20() {
        assertEquals(false, HumanEval_80.isHappy("yyyyyy"));
    }
    
    @Test
    public void testIsHappy21() {
        assertEquals(false, HumanEval_80.isHappy("qwertyuiopasdfghjklzxcvbnmqwertlyuiopasdfghjklzxcvbqwertyuiopasdfghjklzxcvbnmqwertyabcabuiopasdfghjkaaaaabbbdddccccaaeeeedddccccaabcabcabcabcabcabbcabcabcabcacbcaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccaabcabcabcabcabcabcabcabcabcabcabcabcaabcabbcabcabcababcabbcabcabcababcabbbaaaaaaaabbbbccccdeeeddddccabcabcaabcccaaabbddeefffbcabcaabcabcabcabcabcabcabcabcabcabcabcabcabccb11223344556abcabcabcabcabcabcabcabcabcabaaaaabbbbccccdeeeddddccccbbbbaaaaaaaabbbbccccdeeeddddccccbbbbaaaaeeeedddccccaaeeeedddccccacabcabcabcabbcabcabcab65677889900aad4dbbccddeeaabbccddeebbbaaaaeeeedddccccaaeeeedddccccalzxcvb"));
    }
}
// End of Test
