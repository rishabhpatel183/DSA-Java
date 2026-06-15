/*
LeetCode: 26
Title: Remove Duplicates from Sorted Array
Difficulty: Easy

Pattern: Two Pointers

Time Complexity: O(n)
Space Complexity: O(1)

Learning:
Since the array is sorted, duplicates are adjacent.
Use one pointer to scan and one pointer to store unique elements.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                k++;
            }
        }

        return k;
    }
}