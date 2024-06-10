package com.example;
//Here is the Java translation of your Python code:


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanEval_17 {
    public static List<Integer> parseMusic(String musicString) {
        List<String> notes = Arrays.asList(musicString.split(" "));
        List<Integer> beats = new ArrayList<>();
        for (String note : notes) {
            beats.add(countBeats(note));
        }
        return beats;
    }

    private static int countBeats(String note) {
        if (note.equals("o")) return 4;
        else if (note.equals("o|")) return 2;
        else if (note.equals(".|")) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(parseMusic("o o| .| o| o| .| .| .| .| o o"));
    }
}

// End of Code
