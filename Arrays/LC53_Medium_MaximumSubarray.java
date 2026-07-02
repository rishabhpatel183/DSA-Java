/*
LeetCode: 53
Title: Maximum Subarray
Difficulty: Medium

Pattern:
Kadane's Algorithm

Time Complexity:
O(n)

Space Complexity:
O(1)

Approach:
At each element, decide whether to:
1. Continue the current subarray.
2. Start a new subarray from the current element.

If continuing gives a larger sum:
    sum += nums[i]
Else:
    sum = nums[i]

Keep track of the maximum sum encountered.

Learning:
When the current running sum hurts future results,
start a new subarray instead of carrying the negative sum.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int largestSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum + nums[i] > nums[i]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (largestSum < sum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }
}