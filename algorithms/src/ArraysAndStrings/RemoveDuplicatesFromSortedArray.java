package ArraysAndStrings;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String args[]){


        assertionDriver(new int[]{-1,0,1,2,-1,-4}, new int[]{-1,0,1});

    }

    public static void assertionDriver(int[] nums, int[] expected){
        RemoveDuplicatesFromSortedArray o = new RemoveDuplicatesFromSortedArray();
        int k = o.removeDuplicates(nums);
        int[] actual = nums;

        assert k == expected.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expected[i];
        }
        System.out.println(nums);
    }

    public int removeDuplicates(int[] nums) {

    }

}
