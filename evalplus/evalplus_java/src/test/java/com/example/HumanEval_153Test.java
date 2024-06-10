package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_153Test {

    @Test
    public void testStrongestExtension0() {
        String[] extensions = {"tEN", "niNE", "eIGHt8OKe"};
        assertEquals("Watashi.eIGHt8OKe", HumanEval_153.strongestExtension("Watashi", extensions));
    }

    @Test
    public void testStrongestExtension1() {
        String[] extensions = {"nani", "NazeDa", "YEs.WeCaNe", "32145tggg"};
        assertEquals("Boku123.YEs.WeCaNe", HumanEval_153.strongestExtension("Boku123", extensions));
    }

    @Test
    public void testStrongestExtension2() {
        String[] extensions = {"t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321"};
        assertEquals("__YESIMHERE.NuLl__", HumanEval_153.strongestExtension("__YESIMHERE", extensions));
    }

    @Test
    public void testStrongestExtension3() {
        String[] extensions = {"Ta", "TAR", "t234An", "cosSo"};
        assertEquals("K.TAR", HumanEval_153.strongestExtension("K", extensions));
    }

    @Test
    public void testStrongestExtension4() {
        String[] extensions = {"Tab", "123", "781345", "-_-"};
        assertEquals("__HAHA.123", HumanEval_153.strongestExtension("__HAHA", extensions));
    }

    @Test
    public void testStrongestExtension5() {
        String[] extensions = {"HhAas", "okIWILL123", "WorkOut", "Fails", "-_-"};
        assertEquals("YameRore.okIWILL123", HumanEval_153.strongestExtension("YameRore", extensions));
    }

    @Test
    public void testStrongestExtension6() {
        String[] extensions = {"Die", "NowW", "Wow", "WoW"};
        assertEquals("finNNalLLly.WoW", HumanEval_153.strongestExtension("finNNalLLly", extensions));
    }

    @Test
    public void testStrongestExtension7() {
        String[] extensions = {"Bb", "91245"};
        assertEquals("_.Bb", HumanEval_153.strongestExtension("_", extensions));
    }

    @Test
    public void testStrongestExtension8() {
        String[] extensions = {"671235", "Bb"};
        assertEquals("Sp.671235", HumanEval_153.strongestExtension("Sp", extensions));
    }

    @Test
    public void testStrongestExtension9() {
        String[] extensions = {"oneUPPERcaseletter", "TWoUPPERcaseletTErs", "threeUppercaseletters", "fourlowercaseletters"};
        assertEquals("Test3.TWoUPPERcaseletTErs", HumanEval_153.strongestExtension("Test3", extensions));
    }

    @Test
    public void testStrongestExtension10() {
        String[] extensions = {"capitalLETTERS", "lowercaseletters", "mIxEdcAsE"};
        assertEquals("Test2.capitalLETTERS", HumanEval_153.strongestExtension("Test2", extensions));
    }

    @Test
    public void testStrongestExtension11() {
        String[] extensions = {"ALLUPPERcaseletters", "ALLlowercaseletters", "Nolettersatall123", "12345"};
        assertEquals("Test4.12345", HumanEval_153.strongestExtension("Test4", extensions));
    }

    @Test
    public void testStrongestExtension12() {
        String[] extensions = {"Aaa", "ZZZZ", "HHHMeyOneMoreClassClass", "ddd", "E", "HHHHHH", "E", "ZZZZ"};
        assertEquals("My_class.HHHHHH", HumanEval_153.strongestExtension("My_class", extensions));
    }

    @Test
    public void testStrongestExtension13() {
        String[] extensions = {"aBc", "dEf", "Ghi"};
        assertEquals("SampleClass.aBc", HumanEval_153.strongestExtension("SampleClass", extensions));
    }

    @Test
    public void testStrongestExtension14() {
        String[] extensions = {"ThisIsTheExtension"};
        assertEquals("ThisIsTheClassName.ThisIsTheExtension", HumanEval_153.strongestExtension("ThisIsTheClassName", extensions));
    }

    @Test
    public void testStrongestExtension15() {
        String[] extensions = {"qwerty", "asdfgh", "zxcvbn", "QWERTY", "MYCLASS", "ASDFGHJKL", "ZXCVBNM"};
        assertEquals("MYCLASS.ASDFGHJKL", HumanEval_153.strongestExtension("MYCLASS", extensions));
    }

    @Test
    public void testStrongestExtension16() {
        String[] extensions = {"CAMel", "hOrSE", "DoG"};
        assertEquals("Animal.CAMel", HumanEval_153.strongestExtension("Animal", extensions));
    }
}
// End of Test
