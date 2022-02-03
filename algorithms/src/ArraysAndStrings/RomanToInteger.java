package ArraysAndStrings;

// O.I.C.E. - An effective way to consume requirements
// Output   - integer
// Input    - string of roman numeral character
// Constraints and Complexity
//      Are there any stated constraints to the problem?
//      Are there any indicators of time vs space trade-offs?
// Examples and Edge cases

import java.util.HashMap;

public class RomanToInteger {
    static HashMap<String, Integer> values = new HashMap<String, Integer>();
    static{
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
    public static void main(String args[]){
        assertionDriver("III", 3);
        assertionDriver("LVIII", 58);
        assertionDriver("MCMXCIV", 1994);

    }

    public static void assertionDriver(String s, int expected){
        RomanToInteger o = new RomanToInteger();
        int actual = o.romanToInt(s);
        assert expected == actual : "Test Failed, expected: "
                + String.valueOf(expected) + ", actual was: " + String.valueOf(actual);
        System.out.println(actual);
    }

    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length();){
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()){
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }
            if (currentValue < nextValue){
                sum += (nextValue - currentValue);
                i += 2;
            }else{
                sum += currentValue;
                i += 1;
            }
        }
        return sum;
    }
}
