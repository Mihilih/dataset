package com.example;
//Here is the equivalent Java code:


import java.util.ArrayList;
import java.util.List;

public class HumanEval_81 {
    public static List<String> numericalLetterGrade(List<Double> grades) {
        List<String> letterGrades = new ArrayList<>();
        for (Double score : grades) {
            if (score == 4.0) {
                letterGrades.add("A+");
            } else if (score > 3.7) {
                letterGrades.add("A");
            } else if (score > 3.3) {
                letterGrades.add("A-");
            } else if (score > 3.0) {
                letterGrades.add("B+");
            } else if (score > 2.7) {
                letterGrades.add("B");
            } else if (score > 2.3) {
                letterGrades.add("B-");
            } else if (score > 2.0) {
                letterGrades.add("C+");
            } else if (score > 1.7) {
                letterGrades.add("C");
            } else if (score > 1.3) {
                letterGrades.add("C-");
            } else if (score > 1.0) {
                letterGrades.add("D+");
            } else if (score > 0.7) {
                letterGrades.add("D");
            } else if (score > 0.0) {
                letterGrades.add("D-");
            } else {
                letterGrades.add("E");
            }
        }
        return letterGrades;
    }
}

// End of Code
