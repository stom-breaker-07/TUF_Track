package TUF_Track.Arrays;

public class Array4 {
    class Solution {
        public int linearSearch(int nums[], int target) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target) return i;
            }
            return -1;
        }
    }
}
/*Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1
Examples:
Input: nums = [2, 3, 4, 5, 3], target = 3

Output: 1

Explanation: The first occurence of 3 in nums is at index 1*/