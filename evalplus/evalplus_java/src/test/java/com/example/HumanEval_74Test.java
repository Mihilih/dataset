package com.example;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanEval_74Test {

    @Test
    public void test_0() {
        assertArrayEquals(new String[]{}, HumanEval_74.total_match(new String[]{}, new String[]{}));
    }

    @Test
    public void test_1() {
        assertArrayEquals(new String[]{"hi", "hi"}, HumanEval_74.total_match(new String[]{"hi", "admin"}, new String[]{"hi", "hi"}));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new String[]{"hi", "admin"}, HumanEval_74.total_match(new String[]{"hi", "admin"}, new String[]{"hi", "hi", "admin", "project"}));
    }

    @Test
    public void test_3() {
        assertArrayEquals(new String[]{"4"}, HumanEval_74.total_match(new String[]{"4"}, new String[]{"1", "2", "3", "4", "5"}));
    }

    @Test
    public void test_4() {
        assertArrayEquals(new String[]{"hI", "Hi"}, HumanEval_74.total_match(new String[]{"hi", "admin"}, new String[]{"hI", "Hi"}));
    }

    @Test
    public void test_5() {
        assertArrayEquals(new String[]{"hI", "hi", "hi"}, HumanEval_74.total_match(new String[]{"hi", "admin"}, new String[]{"hI", "hi", "hi"}));
    }

    @Test
    public void test_6() {
        assertArrayEquals(new String[]{"hi", "admin"}, HumanEval_74.total_match(new String[]{"hi", "admin"}, new String[]{"hI", "hi", "hii"}));
    }

    @Test
    public void test_7() {
        assertArrayEquals(new String[]{}, HumanEval_74.total_match(new String[]{}, new String[]{"this"}));
    }

    @Test
    public void test_8() {
        assertArrayEquals(new String[]{}, HumanEval_74.total_match(new String[]{"this"}, new String[]{}));
    }

    @Test
    public void test_9() {
        assertArrayEquals(new String[]{""}, HumanEval_74.total_match(new String[]{""}, new String[]{"hello"}));
    }

    @Test
    public void test_10() {
        assertArrayEquals(new String[]{"happy", "birthday", "sarah"}, HumanEval_74.total_match(new String[]{"happy", "birthday", "sarah"}, new String[]{"happy", "birthday", "sally"}));
    }

    @Test
    public void test_11() {
        assertArrayEquals(new String[]{"hijklmnop", "qrstuv", "wxyz", "abcdefg", "qrstqrstuvwxworldyuv", "abcdefg"}, HumanEval_74.total_match(new String[]{"AbCdEfG", "TydBz", "date", "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsT", "UuVvWwXyxYyZz", "HijKlMnOp"}, new String[]{"hijklmnop", "qrstuv", "wxyz", "abcdefg", "qrstqrstuvwxworldyuv", "abcdefg"}));
    }

    @Test
    public void test_12() {
        assertArrayEquals(new String[]{"hello", "world"}, HumanEval_74.total_match(new String[]{"hello", "world"}, new String[]{"cathi", "there"}));
    }

    @Test
    public void test_13() {
        assertArrayEquals(new String[]{"coding", "is", "codig", "fun", "coding"}, HumanEval_74.total_match(new String[]{"coding", "is", "codig", "fun", "coding"}, new String[]{"codogding", "coding", "is", "awesome"}));
    }

    @Test
    public void test_14() {
        assertArrayEquals(new String[]{}, HumanEval_74.total_match(new String[]{"apple", "banana"}, new String[]{}));
    }

    @Test
    public void test_15() {
        assertArrayEquals(new String[]{}, HumanEval_74.total_match(new String[]{}, new String[]{""}));
    }
}
//End of Test
