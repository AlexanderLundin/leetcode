package Facebook;

import java.util.ArrayList;
import java.util.List;

// O.I.C.E. - An effective way to consume requirements
// Output   - string containing the length of the longest substring without repeats
// Input    - string
// Constraints and Complexity
//      Are there any stated constraints to the problem?
//      Are there any indicators of time vs space trade-offs?
// Examples and Edge cases
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]){
        System.out.println(find("abcabcbb"));
        System.out.println(find("bbbbb"));
        System.out.println(find("pwwkew"));
        System.out.println(find(" "));
        System.out.println(find("c"));
    }

    public static int find(String s){
        int longestString = 0;
        if (s.equals(" "))
            return 1;
        for (int i = 0; i < s.length(); i++){
            List<Integer> asciiValues = new ArrayList<Integer>();
            for (int j = i; j < s.length(); j++){
                char character = s.charAt(j);
                String substr = s.substring(i, j + 1);
                Integer asciiValue = Integer.valueOf(character);
                boolean duplicate = asciiValues.contains(asciiValue);
                if (duplicate){
                    int subStringLen = j - i;
                    if (subStringLen > longestString){
                        longestString = subStringLen;
                    }
                    j = s.length();
                }else {
                    int subStringLen = substr.length();
                    if (subStringLen > longestString){
                        longestString = subStringLen;
                    }
                    asciiValues.add(asciiValue);
                }
            }
        }
        return longestString;
    }


}
