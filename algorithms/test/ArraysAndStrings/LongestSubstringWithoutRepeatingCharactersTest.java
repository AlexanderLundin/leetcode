package ArraysAndStrings;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testFind() {
        LongestSubstringWithoutRepeatingCharacters o = new LongestSubstringWithoutRepeatingCharacters();

        Assert.assertEquals(o.find("abcabcbb"), 3);
        Assert.assertEquals(o.find("bbbbb"), 1);
        Assert.assertEquals(o.find("pwwkew"), 3);
        Assert.assertEquals(o.find(" "), 1);
        Assert.assertEquals(o.find("c"), 1);
    }
}