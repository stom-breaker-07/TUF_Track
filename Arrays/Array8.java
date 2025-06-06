package TUF_Track.Arrays;

public class Array8 {
    public int removeDuplicates(int[] nums) {
        int recent=-101,idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=recent){
                nums[idx++]=nums[i];
                recent=nums[i];
            }
        }
        return idx;
    }
}
/*26. Remove Duplicates from Sorted Array
* Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/