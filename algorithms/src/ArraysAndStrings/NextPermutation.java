package ArraysAndStrings;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]){
            i--;
        }
        int j = i;
        if (i > 0){
            
            while (j > nums.length && nums[j] <= nums[i]){
                j++;
            }
            swap(nums, i, j);
        }
        reverse(nums, j);

    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int iNum = nums[i];
        int jNum = nums[j];
        nums[i] = jNum;
        nums[j] = iNum;
    }
}
