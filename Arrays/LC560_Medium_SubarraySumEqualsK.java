/*
 * LeetCode 560 - Subarray Sum Equals K
 * Difficulty: Medium
 *
 * Pattern: Prefix Sum + HashMap
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Key Learning:
 * - Maintain a running prefix sum.
 * - Store prefix sum frequencies in a HashMap.
 * - If (currentSum - k) exists, a valid subarray ends at the current index.
 * - Frequency is stored because the same prefix sum can occur multiple times.
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}