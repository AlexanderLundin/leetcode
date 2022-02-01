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
        int result = 0;
        int sign = 1;
        int index = 0;
        while(s.charAt(index) == ' '){
            index++;
        }
        if (s.charAt(index) == '-'){
            sign = -1;
            index++;
        }else if(s.charAt(index) == '+'){
            sign = 1;
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))){
            char c = s.charAt(index);
            int digit = c - '0';
            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }

        return sign * result;
    }

}
