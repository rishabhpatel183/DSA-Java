/*
LeetCode: 217
Title: Contains Duplicate
Difficulty: Easy

Pattern: HashSet

TC: O(n)
SC: O(n)

Learning:
Use HashSet to store unique values.
Check contains() before adding.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}