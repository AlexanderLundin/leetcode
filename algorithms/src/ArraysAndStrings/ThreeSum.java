package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
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
