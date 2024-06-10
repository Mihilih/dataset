package com.example;
// Here is the equivalent Java JUnit test for the given Python test:


import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_124Test {
    @Test
    public void testValidDate() {
        assertTrue(HumanEval_124.validDate("03-11-2000"));
        assertFalse(HumanEval_124.validDate("15-01-2012"));
        assertFalse(HumanEval_124.validDate("04-0-2040"));
        assertTrue(HumanEval_124.validDate("06-04-2020"));
        assertTrue(HumanEval_124.validDate("01-01-2007"));
        assertFalse(HumanEval_124.validDate("03-32-2011"));
        assertFalse(HumanEval_124.validDate(""));
        assertFalse(HumanEval_124.validDate("04-31-3000"));
        assertTrue(HumanEval_124.validDate("06-06-2005"));
        assertFalse(HumanEval_124.validDate("21-31-2000"));
        assertTrue(HumanEval_124.validDate("04-12-2003"));
        assertFalse(HumanEval_124.validDate("04122003"));
        assertFalse(HumanEval_124.validDate("20030412"));
        assertFalse(HumanEval_124.validDate("2003-04"));
        assertFalse(HumanEval_124.validDate("2003-04-12"));
        assertFalse(HumanEval_124.validDate("04-2003"));
        assertTrue(HumanEval_124.validDate("12-31-1999"));
        assertFalse(HumanEval_124.validDate("04-31-2022"));
        assertFalse(HumanEval_124.validDate("00-01-2000"));
        assertFalse(HumanEval_124.validDate("06-04-202"));
        assertFalse(HumanEval_124.validDate("02-230-200"));
        assertFalse(HumanEval_124.validDate("04-02-2-20"));
        assertFalse(HumanEval_124.validDate("11-31-2023"));
        assertFalse(HumanEval_124.validDate("01-2000210"));
        assertFalse(HumanEval_124.validDate("13-01-2000"));
        assertFalse(HumanEval_124.validDate("01-32-2000"));
        assertFalse(HumanEval_124.validDate("02-30-2000"));
        assertFalse(HumanEval_124.validDate("02-29-20921"));
        assertTrue(HumanEval_124.validDate("02-29-2021"));
        assertFalse(HumanEval_124.validDate("2-29-2001"));
        assertFalse(HumanEval_124.validDate("02-30-2020"));
        assertFalse(HumanEval_124.validDate("06-04-2020\n"));
        assertFalse(HumanEval_124.validDate("-04-310222"));
        assertFalse(HumanEval_124.validDate("044-2022"));
        assertFalse(HumanEval_124.validDate("010-001-20"));
    }
}

// End of Test
