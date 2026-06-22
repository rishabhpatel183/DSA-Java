/*
LeetCode: 20
Title: Valid Parentheses
Difficulty: Easy

Pattern:
Stack

Time Complexity: O(n)
Space Complexity: O(n)

Idea:
Push opening brackets into the stack.

For closing brackets:
Check the top of the stack.

If brackets match:
    pop

Else:
    return false

After processing all characters:
Stack must be empty.

Learning:
Stack follows LIFO (Last In First Out).
The last opened bracket must be closed first.
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (st.isEmpty()) {
                return false;
            } else if (ch == ')' && st.peek() == '(') {
                st.pop();
            } else if (ch == '}' && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && st.peek() == '[') {
                st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty();

    }
}