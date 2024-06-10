package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class HumanEval_81Test {

    @Test
    public void testNumericalLetterGrade() {
        assertEquals(Arrays.asList("A+", "B", "C-", "C", "A-"), HumanEval_81.numericalLetterGrade(Arrays.asList(4.0, 3.0, 1.7, 2.0, 3.5)));
        assertEquals(Arrays.asList("D+"), HumanEval_81.numericalLetterGrade(Arrays.asList(1.2)));
        assertEquals(Arrays.asList("D-"), HumanEval_81.numericalLetterGrade(Arrays.asList(0.5)));
        assertEquals(Arrays.asList("E"), HumanEval_81.numericalLetterGrade(Arrays.asList(0.0)));
        assertEquals(Arrays.asList("D", "D-", "C-", "B", "B+"), HumanEval_81.numericalLetterGrade(Arrays.asList(1.0, 0.3, 1.5, 2.8, 3.3)));
        assertEquals(Arrays.asList("E", "D-"), HumanEval_81.numericalLetterGrade(Arrays.asList(0.0, 0.7)));
        assertEquals(Arrays.asList("A+", "A", "A-", "A-", "B+", "B", "B", "B-", "B-", "C+", "C+", "C", "D", "C", "C-", "C-", "D+", "A-", "D+", "D-", "D-", "E"), HumanEval_81.numericalLetterGrade(Arrays.asList(4.0, 3.9, 3.7, 3.31, 3.29, 3.0, 2.99, 2.7, 2.69, 2.3, 2.29, 2.0, 0.8, 1.99, 1.7, 1.69, 1.3, 3.3462428245777955, 1.29, 0.7, 0.69, 0.0)));
        assertEquals(Arrays.asList("A", "B-", "A", "C+", "D"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.8, 2.5, 3.9, 2.2, 1.0)));
        assertEquals(Arrays.asList("B+", "B-", "C", "D", "D-", "A+"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.1, 2.7, 1.8, 0.9, 0.5, 4.0)));
        assertEquals(Arrays.asList("B+", "B+", "B", "B", "B", "B-"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.2, 3.1, 3.0, 2.9, 2.8, 2.7)));
        assertEquals(Arrays.asList("A+", "A+", "A+", "A+"), HumanEval_81.numericalLetterGrade(Arrays.asList(4.0, 4.0, 4.0, 4.0)));
        assertEquals(Arrays.asList("C-", "C-", "C-", "C-"), HumanEval_81.numericalLetterGrade(Arrays.asList(1.7, 1.7, 1.7, 1.7)));
        assertEquals(Arrays.asList("C", "C", "C", "C"), HumanEval_81.numericalLetterGrade(Arrays.asList(2.0, 2.0, 2.0, 2.0)));
        assertEquals(Arrays.asList("A", "A+", "A+", "A+", "A+", "A+"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.709427582366981, 4.0, 4.0, 4.0, 4.0, 4.0)));
        assertEquals(Arrays.asList("B+", "B+", "B", "D+", "A", "B+"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.2, 3.1, 3.0, 1.042839384499805, 3.7622258594833253, 3.1)));
        assertEquals(Arrays.asList("B+", "A", "B", "B", "B", "A"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.2, 3.8, 3.0, 2.9, 2.8, 3.763604414675102)));
        assertEquals(Arrays.asList("A", "B-", "C+", "A", "B-"), HumanEval_81.numericalLetterGrade(Arrays.asList(3.8, 2.5, 2.2, 3.8, 2.5)));
        assertEquals(Arrays.asList("A+", "A-", "A", "A", "A-", "A-", "C+", "B", "B", "B-", "B-", "C+", "C+", "C", "C", "C-", "C-", "D+", "D+", "D-", "D-", "E"), HumanEval_81.numericalLetterGrade(Arrays.asList(4.0, 3.5182986408219863, 3.9, 3.8, 3.7, 3.31, 2.2, 3.0, 2.99, 2.7, 2.69, 2.3, 2.29, 2.0, 1.99, 1.7, 1.69, 1.3, 1.29, 0.7, 0.69, 0.0)));
        assertEquals(Arrays.asList("E", "E", "E", "E", "E", "E", "E", "E", "E", "E"), HumanEval_81.numericalLetterGrade(Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)));
    }
}

// End of Test
