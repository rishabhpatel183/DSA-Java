/*
 * LeetCode 347 - Top K Frequent Elements
 *
 * Difficulty: Medium
 * Pattern: HashMap + Bucket Sort
 *
 * Approach:
 * 1. Count the frequency of each element using a HashMap.
 * 2. Create buckets where each index represents a frequency.
 * 3. Store numbers in the bucket corresponding to their frequency.
 * 4. Traverse buckets from highest frequency to lowest.
 * 5. Collect the first k elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] arr = new int[k];
        int count = 0;
        for (int i = nums.length; i > 0; i--) {
            if (bucket[i] == null) {
                continue;
            }
            for (int num : bucket[i]) {
                arr[count] = num;
                count++;
                if (count == k) {
                    return arr;
                }
            }
        }
        return arr;
    }
}