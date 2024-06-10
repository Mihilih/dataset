package com.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_82Test {

    @Test
    public void test_0(){
        assertTrue(HumanEval_82.primeLength("Hello"));
    }

    @Test
    public void test_1(){
        assertTrue(HumanEval_82.primeLength("abcdcba"));
    }

    @Test
    public void test_2(){
        assertTrue(HumanEval_82.primeLength("kittens"));
    }

    @Test
    public void test_3(){
        assertFalse(HumanEval_82.primeLength("orange"));
    }

    @Test
    public void test_4(){
        assertTrue(HumanEval_82.primeLength("wow"));
    }

    @Test
    public void test_5(){
        assertTrue(HumanEval_82.primeLength("world"));
    }

    @Test
    public void test_6(){
        assertTrue(HumanEval_82.primeLength("MadaM"));
    }

    @Test
    public void test_7(){
        assertTrue(HumanEval_82.primeLength("Wow"));
    }

    @Test
    public void test_8(){
        assertFalse(HumanEval_82.primeLength(""));
    }

    @Test
    public void test_9(){
        assertTrue(HumanEval_82.primeLength("HI"));
    }

    @Test
    public void test_10(){
        assertTrue(HumanEval_82.primeLength("go"));
    }

    @Test
    public void test_11(){
        assertFalse(HumanEval_82.primeLength("gogo"));
    }

    @Test
    public void test_12(){
        assertFalse(HumanEval_82.primeLength("aaaaaaaaaaaaaaa"));
    }

    @Test
    public void test_13(){
        assertTrue(HumanEval_82.primeLength("Madam"));
    }

    @Test
    public void test_14(){
        assertFalse(HumanEval_82.primeLength("M"));
    }

    @Test
    public void test_15(){
        assertFalse(HumanEval_82.primeLength("0"));
    }

    @Test
    public void test_16(){
        assertTrue(HumanEval_82.primeLength("abcde"));
    }

    @Test
    public void test_17(){
        assertFalse(HumanEval_82.primeLength("abcd"));
    }

    @Test
    public void test_18(){
        assertTrue(HumanEval_82.primeLength("ab"));
    }

    @Test
    public void test_19(){
        assertTrue(HumanEval_82.primeLength("ThWThisthaaatxjmnzThe qulengantidMsYJFEtsgcehuqTkrPxBLWjpDfmvNaRlKOiVbnZIlishmentarilanismbrownover mfox judog.is"));
    }

    @Test
    public void test_20(){
        assertFalse(HumanEval_82.primeLength("a"));
    }

    @Test
    public void test_21(){
        assertFalse(HumanEval_82.primeLength(""));
    }

    @Test
    public void test_22(){
        assertFalse(HumanEval_82.primeLength("The qu ick brown fox jumpsb over the lahaszyThequickbrownfoxjumpsoverthelazydogThequtheickbrownfoxjumpssoverthelazydogog."));
    }

    @Test
    public void test_23(){
        assertTrue(HumanEval_82.primeLength("lengtThiMsYJFEtsgcehuqTkrPdog.xBantidisestablishmentsarRlKOiVgbnZIoaethexBLThWxjmnzThe quickp brownjumpsThe quick brown fox jumps Wxjmnzover the lazy dog.KOiVbThe quick brown fox jumps Wxjmnzover the lazy dog.WxjmnzoveThisnZIoa.h"));
    }

    @Test
    public void test_24(){
        assertFalse(HumanEval_82.primeLength("pabc"));
    }

    @Test
    public void test_25(){
        assertTrue(HumanEval_82.primeLength("sis"));
    }

    @Test
    public void test_26(){
        assertFalse(HumanEval_82.primeLength("aaaa"));
    }
}

