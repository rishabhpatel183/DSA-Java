/*
 * LeetCode 88 - Merge Sorted Array
 * Difficulty: Easy
 *
 * Pattern: Two Pointers (In-place Merge)
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * - Merge from the end to avoid overwriting valid elements in nums1.
 * - Use three pointers:
 *      i -> last valid element in nums1
 *      j -> last element in nums2
 *      k -> last position in nums1
 * - Continue until all elements of nums2 are merged.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j >= 0){
            if(i >= 0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
                k--;
        }
    }
}