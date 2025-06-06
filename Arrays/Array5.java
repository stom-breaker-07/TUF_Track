package TUF_Track.Arrays;

public class Array5 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}
/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/