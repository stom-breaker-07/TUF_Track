package TUF_Track.Arrays;

public class Array10 {
    class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for(int singleNum : nums) {
                result ^= singleNum;
            }
            return result;
        }
    }
}

/*
 hint here is 7 ^ 7 = 0  mean any number that twice the XOR is 0
 Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1
*/
