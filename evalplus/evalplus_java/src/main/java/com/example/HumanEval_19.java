package com.example;
public class HumanEval_19 {

    public static String sortNumbers(String numbers) {
        if (numbers.equals("")) return "";

        String[] splitNumbers = numbers.split(" ");
        Integer[] toInt = new Integer[splitNumbers.length];

        for (int i = 0; i < splitNumbers.length; i++) {
            switch (splitNumbers[i]) {
                case "zero":
                    toInt[i] = 0;
                    break;
                case "one":
                    toInt[i] = 1;
                    break;
                case "two":
                    toInt[i] = 2;
                    break;
                case "three":
                    toInt[i] = 3;
                    break;
                case "four":
                    toInt[i] = 4;
                    break;
                case "five":
                    toInt[i] = 5;
                    break;
                case "six":
                    toInt[i] = 6;
                    break;
                case "seven":
                    toInt[i] = 7;
                    break;
                case "eight":
                    toInt[i] = 8;
                    break;
                case "nine":
                    toInt[i] = 9;
                    break;
            }
        }

        java.util.Arrays.sort(toInt);

        for (int i = 0; i < toInt.length; i++) {
            switch (toInt[i]) {
                case 0:
                    splitNumbers[i] = "zero";
                    break;
                case 1:
                    splitNumbers[i] = "one";
                    break;
                case 2:
                    splitNumbers[i] = "two";
                    break;
                case 3:
                    splitNumbers[i] = "three";
                    break;
                case 4:
                    splitNumbers[i] = "four";
                    break;
                case 5:
                    splitNumbers[i] = "five";
                    break;
                case 6:
                    splitNumbers[i] = "six";
                    break;
                case 7:
                    splitNumbers[i] = "seven";
                    break;
                case 8:
                    splitNumbers[i] = "eight";
                    break;
                case 9:
                    splitNumbers[i] = "nine";
                    break;
            }
        }

        return String.join(" ", splitNumbers);
    }
}
// End of Code.
