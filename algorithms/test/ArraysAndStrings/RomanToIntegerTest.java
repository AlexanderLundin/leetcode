package ArraysAndStrings;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {
        RomanToInteger o = new RomanToInteger();
        Assert.assertEquals(o.romanToInt("III"), 3);
        Assert.assertEquals(o.romanToInt("LVIII"), 58);
        Assert.assertEquals(o.romanToInt("MCMXCIV"), 1994);
    }
}