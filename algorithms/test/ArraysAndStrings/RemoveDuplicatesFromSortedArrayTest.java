package ArraysAndStrings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1,1,2};
        int[] expected = new int[]{1,2};
        RemoveDuplicatesFromSortedArray o = new RemoveDuplicatesFromSortedArray();
        int k = o.removeDuplicates(nums);
        int[] actual = nums;

        assert k == expected.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expected[i];
        }
        System.out.println(nums);
    }
}