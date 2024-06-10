package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import com.example.HumanEval_101;

public class HumanEval_101Test {

    @Test
    public void testWordsString_0() {
        String[] expected = {"Hi", "my", "name", "is", "John"};
        assertArrayEquals(expected, HumanEval_101.words_string("Hi, my name is John"));
    }

    @Test
    public void testWordsString_1() {
        String[] expected = {"One", "two", "three", "four", "five", "six"};
        assertArrayEquals(expected, HumanEval_101.words_string("One, two, three, four, five, six"));
    }

    @Test
    public void testWordsString_2() {
        String[] expected = {"Hi", "my", "name"};
        assertArrayEquals(expected, HumanEval_101.words_string("Hi, my name"));
    }

    @Test
    public void testWordsString_3() {
        String[] expected = {"One", "two", "three", "four", "five", "six"};
        assertArrayEquals(expected, HumanEval_101.words_string("One,, two, three, four, five, six,"));
    }

    @Test
    public void testWordsString_4() {
        String[] expected = {};
        assertArrayEquals(expected, HumanEval_101.words_string(""));
    }

    @Test
    public void testWordsString_5() {
        String[] expected = {"ahmed", "gamal"};
        assertArrayEquals(expected, HumanEval_101.words_string("ahmed     , gamal"));
    }

    @Test
    public void testWordsString_6() {
        String[] expected = {"Elephant", "giraffe", "lion", "zebra"};
        assertArrayEquals(expected, HumanEval_101.words_string("Elephant,giraffe,,lion,zebra"));
    }

    @Test
    public void testWordsString_7() {
        String[] expected = {"Hi", "there", "is", "a", "lot", "of", "space"};
        assertArrayEquals(expected, HumanEval_101.words_string("Hi,there is,a lot,of,space   ,     ,"));
    }

    @Test
    public void testWordsString_8() {
        String[] expected = {"Multi", "line", "string", "Hello", "world!"};
        assertArrayEquals(expected, HumanEval_101.words_string("Multi\nline\nstring\nHello,\nworld!\n"));
    }

}
// End of Test
