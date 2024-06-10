package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_117Test {

    @Test
    public void testSelectWords1() {
        List<String> expected = Arrays.asList("little");
        assertEquals(expected, HumanEval_117.selectWords("Mary had a little lamb", 4));
    }

    @Test
    public void testSelectWords2() {
        List<String> expected = Arrays.asList("Mary", "lamb");
        assertEquals(expected, HumanEval_117.selectWords("Mary had a little lamb", 3));
    }

    @Test
    public void testSelectWords3() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, HumanEval_117.selectWords("simple white space", 2));
    }

    @Test
    public void testSelectWords4() {
        List<String> expected = Arrays.asList("world");
        assertEquals(expected, HumanEval_117.selectWords("Hello world", 4));
    }

    @Test
    public void testSelectWords5() {
        List<String> expected = Arrays.asList("Uncle");
        assertEquals(expected, HumanEval_117.selectWords("Uncle sam", 3));
    }

    @Test
    public void testSelectWords6() {
        List<String> expected = Arrays.asList();
        assertEquals(expected, HumanEval_117.selectWords("", 4));
    }

    @Test
    public void testSelectWords7() {
        List<String> expected = Arrays.asList("b", "c", "d", "f");
        assertEquals(expected, HumanEval_117.selectWords("a b c d e f", 1));
    }

    @Test
    public void testSelectWords8() {
        List<String> expected = Arrays.asList("og");
        assertEquals(expected, HumanEval_117.selectWords("the quick brown fox jumps og", 1));
    }

    @Test
    public void testSelectWords9() {
        List<String> expected = Arrays.asList("a", "a", "a", "a", "a");
        assertEquals(expected, HumanEval_117.selectWords("Python isp a popular programminPython isp a populathis is a test string with multiplePython isp a popular program ming language words containing different numbers of consonants programming  languagePython is a popular progrmming languageg language", 0));
    }

    @Test
    public void testSelectWords10() {
        List<String> expected = Arrays.asList("program", "languageeR");
        assertEquals(expected, HumanEval_117.selectWords("ThE qUiCk BrOwN fOx JuMpS oVPython isp a popular program ming languageeR tHe LaZy DoG", 5));
    }

    @Test
    public void testSelectWords11() {
        List<String> expected = Arrays.asList("apple", "banana");
        assertEquals(expected, HumanEval_117.selectWords("apple banana cherry", 3));
    }
}
// End of Test

