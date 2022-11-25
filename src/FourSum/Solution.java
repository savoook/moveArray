package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//nums = [1,0,-1,0,-2,2]
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int newTarget = target - nums[i] - nums[j];
                int lo = j + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    if (lo > j + 1 && nums[lo - 1] == nums[lo]) {
                        lo++;
                        continue;
                    }
                    if (hi < nums.length - 1 && nums[hi + 1] == nums[hi]) {
                        hi--;
                        continue;
                    }
                    int sum = nums[hi] + nums[lo];
                    if (sum < newTarget) {
                        lo++;
                    } else if (sum > newTarget) {
                        hi--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        lo++;
                        hi--;
                    }
                }
            }
        }
        return result;
    }
}
