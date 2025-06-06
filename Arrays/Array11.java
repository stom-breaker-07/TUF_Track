package TUF_Track.Arrays;
import java.util.Arrays;

public class Array11 {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n1=nums1.length , n2=nums2.length ,i=0,j=0,k=0;
        int[] ans=new int[n1+n2];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else if(nums2[j]>nums1[i]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums1[i++];
                j++;
            }
        }
        while(i < n1){
            ans[k++]=nums1[i++];
        }
        while(j < n2){
            ans[k++]=nums2[j++];
        }
        return Arrays.copyOf(ans,k);
    }
}
/*Examples:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2*/