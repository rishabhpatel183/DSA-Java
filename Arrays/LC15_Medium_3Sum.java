/*
 * LeetCode 15 - 3Sum
 * Difficulty: Medium
 *
 * Pattern: Sorting + Two Pointers
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1) (excluding the output list)
 *
 * Key Learning:
 * - Sort the array before applying the two-pointer technique.
 * - Fix one element and use two pointers to find the remaining two numbers.
 * - Skip duplicate values for i, left, and right to avoid duplicate triplets.
 * - Move left pointer when sum < 0 and right pointer when sum > 0.
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}