package TUF_Track.Arrays;

public class Array6 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(curr,max);
                curr=0;
            }else{
                curr++;
            }
        }
        max=Math.max(curr,max);
        return max;
    }
}

/*Given a binary array nums, return the maximum number of consecutive 1's in the array.



Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.*/