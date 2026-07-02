/*
LeetCode: 724
Title: Find Pivot Index
Difficulty: Easy

Pattern:
Prefix Sum

Time Complexity: O(n)
Space Complexity: O(1)

Learning:
Use totalSum and leftSum to calculate rightSum
without another loop.

Formula:
rightSum = totalSum - leftSum - nums[i]
*/
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}