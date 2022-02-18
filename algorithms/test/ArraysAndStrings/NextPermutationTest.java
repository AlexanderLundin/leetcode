package ArraysAndStrings;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NextPermutationTest {

    @Test
    public void testNextPermutation() {

        NextPermutation o = new NextPermutation();
        int[] nums = new int[]{1,2,3};
        int[] expected = new int[]{1,3,2};
        o.nextPermutation(nums);
        Assert.assertEquals(nums, expected);

    }
}