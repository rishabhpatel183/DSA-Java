/*
LeetCode: 1
Title: Two Sum
Difficulty: Easy

Pattern: HashMap

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
Store number and its index in HashMap.
For each number, find its complement:
target - currentNumber.

DSA Trigger:
Need to find a complement quickly?
→ Think HashMap.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int z = target - nums[i];
            if(map.containsKey(z)){
            int k = map.get(z);
            return new int[]{k,i};
            }
            else{
            map.put(nums[i],i);
            }
        }   
    return new int[]{0,0};
    }
}