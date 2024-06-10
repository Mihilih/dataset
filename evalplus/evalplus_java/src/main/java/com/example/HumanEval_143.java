package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HumanEval_143 {

    public static String wordsInSentence(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .filter(word -> isPrime(word.length()))
                .collect(Collectors.joining(" "));
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordsInSentence("This is a test")); // Output: "is"
        System.out.println(wordsInSentence("lets go for swimming")); // Output: "go for"
    }
}
// End of Code

// The Java version of your function uses the Java Streams API to split the sentence into words, filter the words based on the length being a prime number, and then join the words back together into a sentence. The `isPrime` function checks whether a given number is prime by checking divisibility up to the square root of the number.
