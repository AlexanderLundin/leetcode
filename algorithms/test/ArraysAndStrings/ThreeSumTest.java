package ArraysAndStrings;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum o = new ThreeSum();
        Assert.assertEquals(o.threeSum(new int[]{-1,0,1,2,-1,-4}),
                Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)));
    }
}