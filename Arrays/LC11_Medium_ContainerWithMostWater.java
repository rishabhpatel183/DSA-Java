/*
LeetCode: 11
Title: Container With Most Water
Difficulty: Medium

Pattern:
Two Pointers (Greedy)

Time Complexity:
O(n)

Space Complexity:
O(1)

Approach:
1. Place one pointer at the beginning and one at the end.
2. Calculate the current container area.
3. Update the maximum area.
4. Move the pointer with the smaller height.
5. Continue until both pointers meet.

Key Formula:
Area = min(height[left], height[right]) * (right - left)

Learning:
The shorter wall limits the water level.
Moving the taller wall cannot increase the area,
so always move the shorter wall.
*/
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            area = h * width;
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}