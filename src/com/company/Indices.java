package com.company;

import java.util.ArrayList;

public class Indices {
    public ArrayList<Integer> indices(String text, String pattern) {
        ArrayList<Integer> returnArray = new ArrayList<>();
        String replacementString = "";
        // replacement string for the patterne so i can find the next instance of the pattern
        for (int i = 0; i < pattern.length(); i++) {
            replacementString = replacementString + "a";
        }
        // in case the patterne is only a's this makes sure that the replacement string is different
        if (replacementString.equals(pattern)) {
            replacementString = "";
            for (int i = 0; i < pattern.length(); i++) {
                replacementString = replacementString + "b";
            }
        }
        // finds the index og the patterne, adds in to the array and replaces it with the replacement string,
        // so it can find the next one
        while (text.contains(pattern)) {
            int indexOfPattern = text.indexOf(pattern);
            returnArray.add(indexOfPattern);
            text = text.replaceFirst(pattern, replacementString);
        }
        return returnArray;
    }
}
