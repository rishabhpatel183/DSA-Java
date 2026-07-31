/*
 * LeetCode 128 - Longest Consecutive Sequence
 *
 * Difficulty: Medium
 * Pattern: HashSet
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Approach:
 * - Store all unique numbers in a HashSet.
 * - Iterate through the HashSet instead of the array to avoid duplicate processing.
 * - A number starts a sequence only if (num - 1) is not present.
 * - Expand the sequence using a current pointer while (current + 1) exists.
 * - Track the maximum sequence length.
 *
 * Key Learning:
 * - HashSet provides O(1) average lookup.
 * - Detect sequence starts using !set.contains(num - 1).
 * - Iterate over the HashSet instead of the original array for better performance when duplicates exist.
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestSeq = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }
            int seq = 1;
            int current = num;
            while (set.contains(current + 1)) {
                seq++;
                current = current + 1;
            }
            longestSeq = Math.max(longestSeq, seq);
        }
        return longestSeq;
    }
}