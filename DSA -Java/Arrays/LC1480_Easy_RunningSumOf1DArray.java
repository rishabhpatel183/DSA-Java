/*
LeetCode: 1480
Title: Running Sum of 1D Array
Difficulty: Easy

Pattern: Array Traversal

Approach:
Store the running sum in a new array.
Current running sum = current element + previous running sum.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }
        return arr;
    }
}   