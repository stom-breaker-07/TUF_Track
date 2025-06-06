package TUF_Track.Arrays;

import java.util.Arrays;

public class Array1 {
    class Solution {
        public int largestElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
    }
}
/*Given an array of integers nums, return the value of the largest element in the array


Examples:
Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6*/