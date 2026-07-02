/*
LeetCode: 643
Title: Maximum Average Subarray I
Difficulty: Easy

Pattern:
Sliding Window

Time Complexity:
O(n)

Space Complexity:
O(1)

Approach:
1. Calculate the sum of the first window of size k.
2. Store its average as the current maximum average.
3. Slide the window one element at a time.
4. Remove the outgoing element and add the incoming element.
5. Update the maximum average.

Key Formula:
sum = sum - nums[i - k] + nums[i]

Learning:
Sliding Window reuses the previous window's sum instead of
calculating the sum of every window from scratch, reducing
the time complexity from O(n × k) to O(n).
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAvg = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxAvg = Math.max(maxAvg, sum / k);
        }
        return maxAvg;
    }
}