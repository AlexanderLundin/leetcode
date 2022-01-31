package Uber;

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {
    public static void main(String args[]){
        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        System.out.println(obj.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(obj.minWindow("a", "a"));
        System.out.println(obj.minWindow("a", "aa"));
        System.out.println(obj.minWindow("cabwefgewcwaefgcf", "cae"));
    }

    public String minWindow(String s, String t) {
        List<Integer> asciiValues = new ArrayList<Integer>();
        for (int i = 0; i < t.length(); i++){
            char character = t.charAt(i);
            Integer asciiValue = Integer.valueOf(character);
            asciiValues.add(asciiValue);
        }
        int smallestLength = Integer.MAX_VALUE;
        String smallestWindow = s;
        for (int i = 0; i < s.length(); i++){
            List<Integer> valuesToFind = new ArrayList<>(asciiValues);
            for (int j = i; j < s.length(); j++){
                char character = s.charAt(j);
                String substr = s.substring(i, j + 1);
                Integer asciiValue = Integer.valueOf(character);
                boolean found = valuesToFind.contains(asciiValue);
                if (found){
                    valuesToFind.remove(asciiValue);
                    if (valuesToFind.size() == 0){
                        if (substr.length() < smallestLength){
                            smallestLength = substr.length();
                            smallestWindow = substr;
                        }
                    }
                }
            }
        }
        if (smallestLength == Integer.MAX_VALUE)
            return "";
        return smallestWindow;
    }
}
