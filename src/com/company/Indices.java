package com.company;

import java.util.ArrayList;

public class Indices {
    public ArrayList<Integer> indices(String text, String pattern) {
        ArrayList<Integer> returnArray = new ArrayList<>();
        String replacementString = "";
        for (int i = 0; i < pattern.length(); i++) {
            replacementString = replacementString + "a";
        }
        if (replacementString.equals(pattern)) {
            for (int i = 0; i < pattern.length(); i++) {
                replacementString = replacementString + "b";
            }
        }
        while (text.contains(pattern)) {
            int indexOfPattern = text.indexOf(pattern);
            returnArray.add(indexOfPattern);
            text = text.replaceFirst(pattern, replacementString);
        }
        return returnArray;
    }
}
