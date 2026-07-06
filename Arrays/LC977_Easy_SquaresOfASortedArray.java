/*
 * LeetCode 977 - Squares of a Sorted Array
 * Difficulty: Easy
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Key Learning:
 * - Compare absolute values from both ends of the sorted array.
 * - The largest square always comes from one of the ends.
 * - Fill the result array from the last index towards the first.
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int k = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        int[] ans = new int[nums.length];
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[k] = leftSquare;
                left++;
            }else{
                ans[k] = rightSquare;
                right--;
            }
            k--;
        }
        return ans;
    }
}