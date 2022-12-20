package moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
                pos++;
            }
        }
    }
}
