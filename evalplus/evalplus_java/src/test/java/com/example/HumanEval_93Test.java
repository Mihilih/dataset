package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import com.example.HumanEval_93;

public class HumanEval_93Test {

    @Test
    public void testEncode_1() {
        assertEquals("tgst", HumanEval_93.encode("TEST"));
    }

    @Test
    public void testEncode_2() {
        assertEquals("mWDCSKR", HumanEval_93.encode("Mudasir"));
    }

    @Test
    public void testEncode_3() {
        assertEquals("ygs", HumanEval_93.encode("YES"));
    }

    @Test
    public void testEncode_4() {
        assertEquals("tHKS KS C MGSSCGG", HumanEval_93.encode("This is a message"));
    }

    @Test
    public void testEncode_5() {
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", HumanEval_93.encode("I DoNt KnOw WhAt tO WrItE"));
    }

    @Test
    public void testEncode_6() {
        assertEquals("pYTHQN KS CWGSQMG", HumanEval_93.encode("Python is awesome"));
    }

    @Test
    public void testEncode_7() {
        assertEquals("CBCDGFGHKJKLMNQPQRSTWVWXYZ", HumanEval_93.encode("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testEncode_8() {
        assertEquals("zyxwvwtsrqpqnmlkjkhgfgdcbc", HumanEval_93.encode("ZYXWVUTSRQPONMLKJIHGFEDCBA"));
    }

    @Test
    public void testEncode_9() {
        assertEquals("TQ BG QR NQTzyxwvwtsrqpCBCDGFGHKJKLMNQPQRSTWVWXYZqnmlkjkcbcdgfhgfgdcbc TQ BG", HumanEval_93.encode("to be or notZYXWVUTSRQPabcdefghijklmnopqrstuvwxyzONMLKJIABCDEFHGFEDCBA to be"));
    }

    @Test
    public void testEncode_10() {
        assertEquals("gVGRY GQQD BQY DQGS FKNG", HumanEval_93.encode("Every good boy does fine"));
    }
}
// End of Test
