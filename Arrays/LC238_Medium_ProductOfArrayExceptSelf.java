/*
 * LeetCode 238 - Product of Array Except Self
 * Difficulty: Medium
 *
 * Pattern: Prefix & Suffix Products
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) Extra Space
 *
 * Key Learning:
 * - Store prefix products directly in the answer array.
 * - Traverse from right to left while maintaining a running suffix product.
 * - Multiply prefix and suffix products to get the final answer.
 * - Avoid using division and optimize auxiliary space.
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int rightProduct = 1;
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return ans;
    }
}