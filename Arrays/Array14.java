package TUF_Track.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Array14 {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int Max=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>Max){
                Max=nums[i];
                list.add(Max);
            }
        }
        Collections.reverse(list);

        return list;
    }
}
/*Examples:
Input: nums = [1, 2, 5, 3, 1, 2]

Output: [5, 3, 2]

Explanation: 2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

Input: nums = [-3, 4, 5, 1, -4, -5]

Output: [5, 1, -4, -5]

Explanation: -5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]*/