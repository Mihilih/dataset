package com.example;



import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HumanEval_17Test {

    @Test
    public void testParseMusic_0() {
        assertTrue(HumanEval_17.parseMusic("").isEmpty());
    }

    @Test
    public void testParseMusic_1() {
        assertEquals(Arrays.asList(4, 4, 4, 4), HumanEval_17.parseMusic("o o o o"));
    }

    @Test
    public void testParseMusic_2() {
        assertEquals(Arrays.asList(1, 1, 1, 1), HumanEval_17.parseMusic(".| .| .| .|"));
    }

    @Test
    public void testParseMusic_3() {
        assertEquals(Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4), HumanEval_17.parseMusic("o| o| .| .| o o o o"));
    }

    @Test
    public void testParseMusic_4() {
        assertEquals(Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2), HumanEval_17.parseMusic("o| .| o| .| o o| o o|"));
    }

    @Test
    public void testParseMusic_5() {
        assertEquals(Arrays.asList(1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4), HumanEval_17.parseMusic(".| .| o| o| o| o| .| .| o| o| o| o| o| o| o o o o"));
    }

    @Test
    public void testParseMusic_6() {
        assertEquals(Arrays.asList(4, 2, 2, 2), HumanEval_17.parseMusic("o o| o| o|"));
    }

    @Test
    public void testParseMusic_7() {
        assertTrue(HumanEval_17.parseMusic("").isEmpty());
    }

    @Test
    public void testParseMusic_8() {
        assertEquals(Arrays.asList(4), HumanEval_17.parseMusic("o"));
    }

    @Test
    public void testParseMusic_9() {
        assertEquals(Arrays.asList(2), HumanEval_17.parseMusic("o|"));
    }
}

// End of Test
