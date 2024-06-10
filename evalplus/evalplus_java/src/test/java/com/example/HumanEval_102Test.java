package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanEval_102Test {
    @Test
    public void testChooseNum_0(){
        assertEquals(14, HumanEval_102.choose_num(12, 15));
    }

    @Test
    public void testChooseNum_1(){
        assertEquals(-1, HumanEval_102.choose_num(13, 12));
    }

    @Test
    public void testChooseNum_2(){
        assertEquals(12354, HumanEval_102.choose_num(33, 12354));
    }

    @Test
    public void testChooseNum_3(){
        assertEquals(-1, HumanEval_102.choose_num(5234, 5233));
    }

    @Test
    public void testChooseNum_4(){
        assertEquals(28, HumanEval_102.choose_num(6, 29));
    }

    @Test
    public void testChooseNum_5(){
        assertEquals(-1, HumanEval_102.choose_num(27, 10));
    }

    @Test
    public void testChooseNum_6(){
        assertEquals(-1, HumanEval_102.choose_num(7, 7));
    }

    @Test
    public void testChooseNum_7(){
        assertEquals(546, HumanEval_102.choose_num(546, 546));
    }

    @Test
    public void testChooseNum_8(){
        assertEquals(30, HumanEval_102.choose_num(20, 30));
    }

    @Test
    public void testChooseNum_9(){
        assertEquals(30, HumanEval_102.choose_num(30, 30));
    }

    @Test
    public void testChooseNum_10(){
        assertEquals(-1, HumanEval_102.choose_num(100, 6));
    }

    @Test
    public void testChooseNum_11(){
        assertEquals(-1, HumanEval_102.choose_num(201, 201));
    }

    @Test
    public void testChooseNum_12(){
        assertEquals(200, HumanEval_102.choose_num(200, 201));
    }

    @Test
    public void testChooseNum_13(){
        assertEquals(100, HumanEval_102.choose_num(35, 101));
    }

    @Test
    public void testChooseNum_14(){
        assertEquals(-1, HumanEval_102.choose_num(35, 35));
    }
}
//End of Test
