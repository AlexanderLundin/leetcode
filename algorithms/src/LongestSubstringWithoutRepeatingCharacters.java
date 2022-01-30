// O.I.C.E. - An effective way to consume requirements
// Output   - string containing the length of the longest substring without repeats
// Input    - string
// Constraints and Complexity
//      Are there any stated constraints to the problem?
//      Are there any indicators of time vs space trade-offs?
// Examples and Edge cases

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]){
        System.out.println(find("abcabcbb"));
        System.out.println(find("bbbbb"));
        System.out.println(find("pwwkew"));
    }

    public static int find(String str){
        int longestString = 0;
        for (int i = 0; i < str.length(); i++){
            List<Integer> asciiValues = new ArrayList<Integer>();
            for (int j = i; j < str.length(); j++){
                char character = str.charAt(j);
                Integer asciiValue = Integer.valueOf(character);
                boolean duplicate = asciiValues.contains(asciiValue);
                if (duplicate){
                    int subStringLen = j - i;
                    if (subStringLen > longestString){
                        longestString = subStringLen;
                    }
                    j = str.length();
                }else {
                    asciiValues.add(asciiValue);
                }
            }
        }
        return longestString;
    }


}
