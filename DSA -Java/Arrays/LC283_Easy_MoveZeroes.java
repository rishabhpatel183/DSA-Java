/*
LeetCode: 283
Title: Move Zeroes
Difficulty: Easy

Pattern:
Two Pointers

Time Complexity: O(n)
Space Complexity: O(1)

Idea:
Move all non-zero elements to the front.

Use j to track the next position where a non-zero element should be placed.

After placing all non-zero elements,
fill the remaining positions with zeros.

Learning:
i -> scans the array
j -> stores useful elements

Same pattern as:
LC26 - Remove Duplicates
LC27 - Remove Element
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}