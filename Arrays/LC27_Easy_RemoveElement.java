/*
LeetCode: 27
Title: Remove Element
Difficulty: Easy

Pattern: Two Pointers

Time Complexity: O(n)
Space Complexity: O(1)

Learning:
Keep valid elements at the front of the array.
Elements after the returned index are ignored.
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }  
        }
        return j;
    }
}