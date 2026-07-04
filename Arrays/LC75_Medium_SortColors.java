/*
 * LeetCode 75 - Sort Colors
 * Difficulty: Medium
 *
 * Pattern: Dutch National Flag Algorithm (Three Pointers)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * - Maintain three regions using low, mid, and high pointers.
 * - Move 0s to the left and 2s to the right.
 * - 1s automatically remain in the middle.
 * - Do not increment mid after swapping with high because the swapped element is still unprocessed.
 */
class Solution {
    public void sortColors(int[] nums) {
        int num;
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 2 ){
               num = nums[high];
               nums[high] = nums[mid];
               nums[mid] = num;
               high--;
            }else if(nums[mid] == 0){
                num = nums[low];
                nums[low] = nums[mid];
                nums[mid] = num;
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
}