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
        assertionDriver("42", 42);
        assertionDriver("   -42", -42);
    }

    public static void assertionDriver(String s, int expected){
        StringToInteger o = new StringToInteger();
        int actual = o.myAtoi(s);
        assert expected == actual : "Test Failed, expected: "
                + String.valueOf(expected) + ", actual was: " + String.valueOf(actual);
        System.out.println(actual);
    }

    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = s.length();

        // Discard all spaces from the beginning of the input string.
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // sign = +1, if it's positive number, otherwise sign = -1.
        if (index < n && s.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // Traverse next digits of input and stop if it is not a digit
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check overflow and underflow conditions.
            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Append current digit to the result.
            result = 10 * result + digit;
            index++;
        }

        // We have formed a valid number without any overflow/underflow.
        // Return it after multiplying it with its sign.
        return sign * result;
    }

}
