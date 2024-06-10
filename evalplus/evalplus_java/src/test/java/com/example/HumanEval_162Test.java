package com.example;
//Here is the Java equivalent of the Python tests you provided:


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_162Test {

    @Test
    public void testStringToMd5_0() {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", HumanEval_162.stringToMd5("Hello world"));
    }

    @Test
    public void testStringToMd5_1() {
        assertEquals(null, HumanEval_162.stringToMd5(""));
    }

    @Test
    public void testStringToMd5_2() {
        assertEquals("0ef78513b0cb8cef12743f5aeb35f888", HumanEval_162.stringToMd5("A B C"));
    }

    @Test
    public void testStringToMd5_3() {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", HumanEval_162.stringToMd5("password"));
    }

    @Test
    public void testStringToMd5_4() {
        assertEquals("0dbb501bb9d84c751d2cf6394d9308c0", HumanEval_162.stringToMd5("5873hajsdklh"));
    }

    @Test
    public void testStringToMd5_5() {
        assertEquals(null, HumanEval_162.stringToMd5(""));
    }

    @Test
    public void testStringToMd5_6() {
        assertEquals("68b815d9746af477c06423c983860af9", HumanEval_162.stringToMd5("This is a long string to hash to MD5"));
    }

    @Test
    public void testStringToMd5_7() {
        assertEquals("de770a3b085331041645531bd9be7d70", HumanEval_162.stringToMd5(" \t \n \r  "));
    }
}

//End of Test
