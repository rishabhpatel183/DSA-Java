/*
LeetCode: 242
Title: Valid Anagram
Difficulty: Easy

Pattern:
Frequency Counting + HashMap

Time Complexity: O(n)
Space Complexity: O(n)

Learning:
Store Character -> Frequency.
Two strings are anagrams if their frequency maps are equal.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        if(s.length() == t.length()){
            for(int i = 0; i < s.length() ; i++){
                char ch = s.charAt(i);
                if(map1.containsKey(ch)){
                    map1.put(ch,map1.get(ch) + 1);
                }
                else{
                    map1.put(ch,1);
                }
                char cha = t.charAt(i);
                if(map2.containsKey(cha)){
                    map2.put(cha,map2.get(cha) + 1);
                }
                else{
                    map2.put(cha,1);
                }
            }
        return map1.equals(map2);
        }
        else{return false;}
    }
}