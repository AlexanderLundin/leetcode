package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String args[]){


        assertionDriver(new int[]{-1,0,1,2,-1,-4}, Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)));

    }

    public static void assertionDriver(int[] nums, List<List<Integer>> expected){
        ThreeSum o = new ThreeSum();
        List<List<Integer>> actual = o.threeSum(nums);
        assert expected == actual : "Test Failed, expected: "
                + String.valueOf(expected) + ", actual was: " + String.valueOf(actual);
        System.out.println(actual);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++){
            if (i == 0 || nums[i - 1] != nums[i] ){
                TwoSum(nums, i, result);
            }
        }
        return result;
    }

    public List<List<Integer>> TwoSum(int[] nums, int i, List<List<Integer>> result) {
        int low = i + 1;
        int hi = nums.length - 1;
        while (low < hi){
            int sum = nums[i] + nums[low] + nums[hi];
            if (sum < 0){
                low++;
            } else if (sum > 0){
                hi--;
            }else{
                result.add(Arrays.asList(nums[i], nums[low++], nums[hi--]));
                while (low < hi && nums[low] == nums[low - 1]){
                    ++low;
                }
            }
        }
        return result;

    }
}
