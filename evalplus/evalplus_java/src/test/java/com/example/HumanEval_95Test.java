package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HumanEval_95Test {

    @Test
    public void test_0() {
        Map<String, String> map = new HashMap<>();
        map.put("p", "pineapple");
        map.put("b", "banana");
        assertTrue(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_2() {
        Map<String, String> map = new HashMap<>();
        map.put("p", "pineapple");
        map.put("A", "banana");
        map.put("B", "banana");
        assertFalse(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_4() {
        Map<String, String> map = new HashMap<>();
        map.put("p", "pineapple");
        map.put("5", "banana");
        map.put("a", "apple");
        assertFalse(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_6() {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "John");
        map.put("Age", "36");
        map.put("City", "Houston");
        assertFalse(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_8() {
        Map<String, String> map = new HashMap<>();
        map.put("STATE", "NC");
        map.put("ZIP", "12345");
        assertTrue(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_10() {
        Map<String, String> map = new HashMap<>();
        map.put("fruit", "Orange");
        map.put("taste", "Sweet");
        assertTrue(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_12() {
        Map<String, String> map = new HashMap<>();
        assertFalse(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_14() {
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "John");
        map.put("LAST_NAME", "DOE");
        map.put("AGE", "35");
        map.put("CITY", "NEW YORK");
        map.put("INCOME", "$50,000");
        assertTrue(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_16() {
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "John");
        map.put("last_name", "Doe");
        map.put("age", "35");
        map.put("city", "New York");
        map.put("income", "$50,000");
        assertTrue(HumanEval_95.checkDictCase(map));
    }

    @Test
    public void test_17() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "apple");
        map.put("2", "banana");
        map.put("3", "cherry");
        assertFalse(HumanEval_95.checkDictCase(map));
    }
}
// End of Test

