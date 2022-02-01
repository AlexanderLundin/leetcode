package ArraysAndStrings;

// O.I.C.E. - An effective way to consume requirements
// Output   - integer
// Input    - string
// Constraints and Complexity
//      Are there any stated constraints to the problem?
//      Are there any indicators of time vs space trade-offs?
// Examples and Edge cases
//      ignore whitespace " "

public class StringToInteger {

    public static void main(String args[]){
        assertionDriver("s", 42);
        assertionDriver("   -42", -42);
    }

    public static void assertionDriver(String s, int expected){
        StringToInteger o = new StringToInteger();
        int actual = o.myAtoi(s);
        assert expected == actual : "Test Failed";
        System.out.println(actual);
    }

    public int myAtoi(String s) {
        return 42;
    }

}
