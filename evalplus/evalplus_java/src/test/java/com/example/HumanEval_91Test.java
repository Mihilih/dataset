package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_91Test {

    @Test
    public void testIsBored0() {
        assertEquals(0, HumanEval_91.is_bored("Hello world"));
    }

    @Test
    public void testIsBored1() {
        assertEquals(0, HumanEval_91.is_bored("Is the sky blue?"));
    }

    @Test
    public void testIsBored2() {
        assertEquals(1, HumanEval_91.is_bored("I love it !"));
    }

    @Test
    public void testIsBored3() {
        assertEquals(0, HumanEval_91.is_bored("bit"));
    }

    @Test
    public void testIsBored4() {
        assertEquals(2, HumanEval_91.is_bored("I feel good today. I will be productive. will kill It"));
    }

    @Test
    public void testIsBored5() {
        assertEquals(0, HumanEval_91.is_bored("You and I are going for a walk"));
    }

    @Test
    public void testIsBored6() {
        assertEquals(2, HumanEval_91.is_bored("I am very happy today. I love spending time with my friends."));
    }

    @Test
    public void testIsBored7() {
        assertEquals(2, HumanEval_91.is_bored("Hello world. I am feeling good today. Are the plants green? Who knows! I bet It is hot outside."));
    }

    @Test
    public void testIsBored8() {
        assertEquals(1, HumanEval_91.is_bored("Have you ever gone skydiving before? I did it once and it was amazing."));
    }

    @Test
    public void testIsBored9() {
        assertEquals(2, HumanEval_91.is_bored("I have a lot of work to do today. I wish I could take a nap instead. I forgot my phone in the car. Oh no, now I have to go back and get it."));
    }

    @Test
    public void testIsBored10() {
        assertEquals(4, HumanEval_91.is_bored("Hello world. I am feeling good today. Are the plants green? Who knows! I bet It is hot outside. Hello world. I am feeling good today. Are the plants green? Who knows! I bet It is hot outside."));
    }

    @Test
    public void testIsBored11() {
        assertEquals(0, HumanEval_91.is_bored("In the morning, I like to have a cup of coffee to start my day off right. How about you? I forgot my phone in the car. Oh no, now I have to go back and get it."));
    }

    @Test
    public void testIsBored12() {
        assertEquals(0, HumanEval_91.is_bored("I"));
    }
}

// End of Test
