/*
LeetCode: 125
Title: Valid Palindrome
Difficulty: Easy

Pattern:
Two Pointers (Opposite Ends)

TC: O(n)
SC: O(1)

Learning:
Skip non-alphanumeric characters.
Compare characters from both ends.
Move pointers toward each other.
*/
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}