package TUF_Track.Arrays;

public class Array3 {
    class Solution {
        public int secondLargestElement(int[] nums) {
            int len=nums.length;
            if(len<2) return -1;
            int first=Integer.MIN_VALUE,Sec=Integer.MIN_VALUE;

            for(int num : nums){

                if(num > first){
                    first=num;
                    Sec=first;
                }else if (num < first && num > Sec){
                    Sec=num;
                }
            }
            return (Sec == Integer.MIN_VALUE) ? -1 : Sec;
        }
    }
}
/*Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Examples:
Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation: The largest value in nums is 8, the second largest is 7*/