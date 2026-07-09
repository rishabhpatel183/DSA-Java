/*
 * LeetCode 49 - Group Anagrams
 * Difficulty: Medium
 *
 * Pattern: HashMap + Sorting
 *
 * Time Complexity: O(n × k log k)
 * Space Complexity: O(n × k)
 *
 * Key Learning:
 * - Sort each string to create a common key for all anagrams.
 * - Use a HashMap<String, List<String>> to group strings.
 * - If the sorted key already exists, add the string to its list.
 * - Otherwise, create a new list and store it in the HashMap.
 * - Return all grouped anagram lists from the HashMap.
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String key = new String(str);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}