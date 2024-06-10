package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.HumanEval_50;

public class HumanEval_50Test {

    @Test
    public void testDecodeShift_0() {
        assertEquals("oviotrxxkefdhngjokun", HumanEval_50.decodeShift("tantywccpjkimslotpzs"));
    }

    @Test
    public void testDecodeShift_1() {
        assertEquals("xgfiasyijs", HumanEval_50.decodeShift("clknfxdnox"));
    }

    // ... repeat for other test cases ...

    @Test
    public void testDecodeShift_100() {
        assertEquals("vwxyzabcdefghijklmnopqrstu", HumanEval_50.decodeShift("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testDecodeShift_101() {
        assertEquals("zixjyzyihznnvbzirdocincdao", HumanEval_50.decodeShift("encoded message with shift"));
    }
}

// End of Test
