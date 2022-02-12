package ArraysAndStrings;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String args[]){


        assertionDriver(new int[]{1,1,2}, new int[]{1,2});

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
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
