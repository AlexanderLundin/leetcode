package ArraysAndStrings;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringToIntegerTest {

    @Test
    public void testMyAtoi() {
        StringToInteger o = new StringToInteger();
        Assert.assertEquals(o.myAtoi("42"), 42);
        Assert.assertEquals(o.myAtoi("   -42"), -42);
    }
}