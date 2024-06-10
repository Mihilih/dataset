package com.example;
import org.junit.*;
import static org.junit.Assert.*;

public class HumanEval_158Test {
    @Test
    public void test1() {
        String[] words = {"name", "of", "string"};
        assertEquals("string", HumanEval_158.find_max(words));
    }

    @Test
    public void test2() {
        String[] words = {"name", "enam", "game"};
        assertEquals("enam", HumanEval_158.find_max(words));
    }

    @Test
    public void test3() {
        String[] words = {"aaaaaaa", "bb", "cc"};
        assertEquals("aaaaaaa", HumanEval_158.find_max(words));
    }

    @Test
    public void test4() {
        String[] words = {"abc", "cba"};
        assertEquals("abc", HumanEval_158.find_max(words));
    }

    @Test
    public void test5() {
        String[] words = {"play", "this", "game", "of", "footbott"};
        assertEquals("footbott", HumanEval_158.find_max(words));
    }

    @Test
    public void test6() {
        String[] words = {"we", "are", "gonna", "rock"};
        assertEquals("gonna", HumanEval_158.find_max(words));
    }

    @Test
    public void test7() {
        String[] words = {"we", "are", "a", "mad", "nation"};
        assertEquals("nation", HumanEval_158.find_max(words));
    }

    @Test
    public void test8() {
        String[] words = {"this", "is", "a", "prrk"};
        assertEquals("this", HumanEval_158.find_max(words));
    }

    @Test
    public void test9() {
        String[] words = {"b"};
        assertEquals("b", HumanEval_158.find_max(words));
    }

    @Test
    public void test10() {
        String[] words = {"play", "play", "play"};
        assertEquals("play", HumanEval_158.find_max(words));
    }

    @Test
    public void test11() {
        String[] words = {"abacbdce", "edcbacba", "dbcaebda"};
        assertEquals("abacbdce", HumanEval_158.find_max(words));
    }

    @Test
    public void test12() {
        String[] words = {""};
        assertEquals("", HumanEval_158.find_max(words));
    }

    @Test
    public void test13() {
        String[] words = {"f", "ff", ""};
        assertEquals("f", HumanEval_158.find_max(words));
    }

    @Test
    public void test14() {
        String[] words = {"qrsutuv", "aaddzz", "qrstuv", "ijklmn", "efghip", "cba", "qrstuv"};
        assertEquals("efghip", HumanEval_158.find_max(words));
    }

    @Test
    public void test15() {
        String[] words = {"abc", "bcd", "def", "bbcd", "efg"};
        assertEquals("abc", HumanEval_158.find_max(words));
    }

    @Test
    public void test16() {
        String[] words = {"Eaglexyx", "iHaTethiss", "eAgLe"};
        assertEquals("iHaTethiss", HumanEval_158.find_max(words));
    }

    @Test
    public void test17() {
        String[] words = {"", "apple", "orange", "abanana", "grape", "ana", "banana", "kiwi", "pear"};
        assertEquals("orange", HumanEval_158.find_max(words));
    }
} // End of Test
