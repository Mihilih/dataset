package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_143Test {
    
    @Test
    public void testWordsInSentence1() {
        assertEquals("is", HumanEval_143.wordsInSentence("This is a test"));
    }

    @Test
    public void testWordsInSentence2() {
        assertEquals("go for", HumanEval_143.wordsInSentence("lets go for swimming"));
    }

    @Test
    public void testWordsInSentence3() {
        assertEquals("there is no place", HumanEval_143.wordsInSentence("there is no place available here"));
    }

    @Test
    public void testWordsInSentence4() {
        assertEquals("Hi am Hussein", HumanEval_143.wordsInSentence("Hi I am Hussein"));
    }

    @Test
    public void testWordsInSentence5() {
        assertEquals("go for it", HumanEval_143.wordsInSentence("go for it"));
    }

    @Test
    public void testWordsInSentence6() {
        assertEquals("", HumanEval_143.wordsInSentence("here"));
    }

    @Test
    public void testWordsInSentence7() {
        assertEquals("is", HumanEval_143.wordsInSentence("here is"));
    }
    
    @Test
    public void testWordsInSentence8() {
        assertEquals("am", HumanEval_143.wordsInSentence("I am a developer"));
    }
    
    @Test
    public void testWordsInSentence9() {
        assertEquals("programming is fun", HumanEval_143.wordsInSentence("Python programming is fun"));
    }
    
    @Test
    public void testWordsInSentence10() {
        assertEquals("am is efficienteveloper", HumanEval_143.wordsInSentence("I am a dquick sort algorithm is efficienteveloper"));
    }
    
    @Test
    public void testWordsInSentence11() {
        assertEquals("can bI fox jumps the the dog asy", HumanEval_143.wordsInSentence("mahthematics can bI athe qurown fox jumps over the lazy dogm a developethse q the lazy dog asy"));
    }
    
    @Test
    public void testWordsInSentence12() {
        assertEquals("abc defghijklmnopqrstuvwxyz", HumanEval_143.wordsInSentence("abcdefghijklmnopqrstuvwxyz abc defghijklmnopqrstuvwxyz"));
    }
}
//End of Test
