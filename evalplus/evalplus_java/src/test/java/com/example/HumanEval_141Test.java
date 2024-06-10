package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class HumanEval_141Test {
    @Test
    public void test_0() {
        assertEquals("Yes", HumanEval_141.file_name_check("example.txt"));
    }

    @Test
    public void test_1() {
        assertEquals("No", HumanEval_141.file_name_check("1example.dll"));
    }

    @Test
    public void test_2() {
        assertEquals("No", HumanEval_141.file_name_check("s1sdf3.asd"));
    }

    @Test
    public void test_3() {
        assertEquals("Yes", HumanEval_141.file_name_check("K.dll"));
    }

    @Test
    public void test_4() {
        assertEquals("Yes", HumanEval_141.file_name_check("MY16FILE3.exe"));
    }

    @Test
    public void test_5() {
        assertEquals("No", HumanEval_141.file_name_check("His12FILE94.exe"));
    }

    @Test
    public void test_6() {
        assertEquals("No", HumanEval_141.file_name_check("_Y.txt"));
    }

    @Test
    public void test_7() {
        assertEquals("No", HumanEval_141.file_name_check("?aREYA.exe"));
    }

    @Test
    public void test_8() {
        assertEquals("No", HumanEval_141.file_name_check("/this_is_valid.dll"));
    }

    @Test
    public void test_9() {
        assertEquals("No", HumanEval_141.file_name_check("this_is_valid.wow"));
    }

    @Test
    public void test_10() {
        assertEquals("Yes", HumanEval_141.file_name_check("this_is_valid.txt"));
    }

    @Test
    public void test_11() {
        assertEquals("No", HumanEval_141.file_name_check("this_is_valid.txtexe"));
    }

    @Test
    public void test_12() {
        assertEquals("No", HumanEval_141.file_name_check("#this2_i4s_5valid.ten"));
    }

    @Test
    public void test_13() {
        assertEquals("No", HumanEval_141.file_name_check("@this1_is6_valid.exe"));
    }

    @Test
    public void test_14() {
        assertEquals("No", HumanEval_141.file_name_check("this_is_12valid.6exe4.txt"));
    }

    @Test
    public void test_15() {
        assertEquals("No", HumanEval_141.file_name_check("all.exe.txt"));
    }

    @Test
    public void test_16() {
        assertEquals("Yes", HumanEval_141.file_name_check("I563_No.exe"));
    }

    @Test
    public void test_17() {
        assertEquals("Yes", HumanEval_141.file_name_check("Is3youfault.txt"));
    }

    @Test
    public void test_18() {
        assertEquals("Yes", HumanEval_141.file_name_check("no_one#knows.dll"));
    }

    @Test
    public void test_19() {
        assertEquals("No", HumanEval_141.file_name_check("1I563_Yes3.exe"));
    }

    @Test
    public void test_20() {
        assertEquals("No", HumanEval_141.file_name_check("I563_Yes3.txtt"));
    }

    @Test
    public void test_21() {
        assertEquals("No", HumanEval_141.file_name_check("final..txt"));
    }

    @Test
    public void test_22() {
        assertEquals("No", HumanEval_141.file_name_check("final132"));
    }

    @Test
    public void test_23() {
        assertEquals("No", HumanEval_141.file_name_check("_f4indsartal132."));
    }

    @Test
    public void test_24() {
        assertEquals("No", HumanEval_141.file_name_check(".txt"));
    }

    @Test
    public void test_25() {
        assertEquals("No", HumanEval_141.file_name_check("s."));
    }

    @Test
    public void test_26() {
        assertEquals("No", HumanEval_141.file_name_check("example.py"));
    }

    @Test
    public void test_27() {
        assertEquals("Yes", HumanEval_141.file_name_check("hello world.exe"));
    }

    @Test
    public void test_28() {
        assertEquals("No", HumanEval_141.file_name_check("alice.123.txt"));
    }

    @Test
    public void test_29() {
        assertEquals("No", HumanEval_141.file_name_check("1script.bat"));
    }

    @Test
    public void test_30() {
        assertEquals("No", HumanEval_141.file_name_check(".exe"));
    }

    @Test
    public void test_31() {
        assertEquals("No", HumanEval_141.file_name_check(".exalice.12123.txt3.xtxte"));
    }

    @Test
    public void test_32() {
        assertEquals("Yes", HumanEval_141.file_name_check("abc123def.exe"));
    }

    @Test
    public void test_33() {
        assertEquals("No", HumanEval_141.file_name_check("1.txt"));
    }

    @Test
    public void test_34() {
        assertEquals("No", HumanEval_141.file_name_check("therearemorethan3digits1234567890inthisname.exe"));
    }

    @Test
    public void test_35() {
        assertEquals("Yes", HumanEval_141.file_name_check("validfile.txt"));
    }

    @Test
    public void test_36() {
        assertEquals("Yes", HumanEval_141.file_name_check("heello world.exe"));
    }

    @Test
    public void test_37() {
        assertEquals("Yes", HumanEval_141.file_name_check("éxample.exe"));
    }

    @Test
    public void test_38() {
        assertEquals("No", HumanEval_141.file_name_check("hello world.exe.exmy.docx.exe"));
    }

    @Test
    public void test_39() {
        assertEquals("No", HumanEval_141.file_name_check(""));
    }

    @Test
    public void test_40() {
        assertEquals("No", HumanEval_141.file_name_check("example.TXt"));
    }
}
// End of Test
