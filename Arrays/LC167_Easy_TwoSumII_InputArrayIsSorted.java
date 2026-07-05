/*
 * LeetCode 167 - Two Sum II: Input Array Is Sorted
 * Difficulty: Easy
 *
 * Pattern: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * - The array is already sorted, allowing the use of two pointers.
 * - If the current sum is smaller than the target, move the left pointer.
 * - If the current sum is larger than the target, move the right pointer.
 * - Return 1-based indices as required by the problem.
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
}