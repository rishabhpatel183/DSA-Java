/*
LeetCode: 169
Title: Majority Element
Difficulty: Easy

Pattern:
HashMap + Frequency Counting

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
Store Number -> Frequency.
Return the number whose frequency becomes greater than n/2.
*/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}