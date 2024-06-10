package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanEval_12Test {
    @Test
    public void test_0() {
        assertEquals(null, HumanEval_12.longest(new ArrayList<String>()));
    }

    @Test
    public void test_1() {
        assertEquals("x", HumanEval_12.longest(Arrays.asList("x", "y", "z")));
    }

    @Test
    public void test_2() {
        assertEquals("zzzz", HumanEval_12.longest(Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc")));
    }

    @Test
    public void test_3() {
        assertEquals("aaa", HumanEval_12.longest(Arrays.asList("", "a", "aa", "aaa")));
    }

    @Test
    public void test_4() {
        assertEquals(null, HumanEval_12.longest(new ArrayList<String>()));
    }

    @Test
    public void test_5() {
        assertEquals("bună ziua", HumanEval_12.longest(Arrays.asList("", "Hola,", "◯◯◯", "bună ziua", " привет,", " ", "😀😀😀", "         ", "rape")));
    }

    @Test
    public void test_6() {
        assertEquals("Apple", HumanEval_12.longest(Arrays.asList("Apple", "bbccc")));
    }

    @Test
    public void test_7() {
        assertEquals("  a   ", HumanEval_12.longest(Arrays.asList("  a   ")));
    }

    @Test
    public void test_8() {
        assertEquals("  Grrape   ", HumanEval_12.longest(Arrays.asList(" ", "", "        ", "  Grrape   ", "ß", "   \t", " ", " ")));
    }

    @Test
    public void test_9() {
        assertEquals("horse", HumanEval_12.longest(Arrays.asList("cat", "horse")));
    }

    @Test
    public void test_10() {
        assertEquals("ß", HumanEval_12.longest(Arrays.asList("ß", "◯", "ß", "Ø", "œ", "\uf8ff")));
    }

    @Test
    public void test_11() {
        assertEquals("aa", HumanEval_12.longest(Arrays.asList("a", "b", "aa", "bb")));
    }

    @Test
    public void test_12() {
        assertEquals("こんにちは, Bonjour,u Hello, Hola, прbună ziuaвет", HumanEval_12.longest(Arrays.asList("Hello, Bonjour, こんにちは, Hola, приNEsвет", "Hello, Bonjour, こんにちは, Hola, приNEsвет", "こんにちは, Bonjour,u Hello, Hola, привет", "こんにちは, Bonjour,u Hello, Hola, прbună ziuaвет", "привет, Hola, Bonjour, こんにちは, Hello", "Hello, Bonjour, こんにちは, Hola, приNEsвет")));
    }
}

// End of Test

