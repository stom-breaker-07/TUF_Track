class Solution:
    def lowerBound(self, nums, x):
        i,j=0,len(nums)-1
        ans=-1
        while i<j:
            mid=i+(j-i)//2
            if nums[mid]>=x:
                j=mid
                ans=mid
            else:
                i=mid+1
        return ans

