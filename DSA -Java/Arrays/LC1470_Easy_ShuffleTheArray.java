/*
LeetCode: 1470
Difficulty: Easy
Pattern: Array Manipulation

TC: O(n)
SC: O(n)

Learning:
Use index mapping (2*i, 2*i+1) to place elements in required positions.
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num = new int[2 * n];
        for (int i = 0; i < n; i++) {
            num[2 * i] = nums[i];
            num[2 * i + 1] = nums[i + n];

        }
        return num;
    }
}