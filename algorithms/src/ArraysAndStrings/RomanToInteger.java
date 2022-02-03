package ArraysAndStrings;

// O.I.C.E. - An effective way to consume requirements
// Output   - integer
// Input    - string of roman numeral character
// Constraints and Complexity
//      Are there any stated constraints to the problem?
//      Are there any indicators of time vs space trade-offs?
// Examples and Edge cases

public class RomanToInteger {

    public static void main(String args[]){
        assertionDriver("I", 3);
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
        return 3;
    }
}
