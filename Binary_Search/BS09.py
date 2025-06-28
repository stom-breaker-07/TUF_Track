class Solution:
    def findKRotation(self, nums):
        i,j=0,len(nums)-1
        while(i<=j):
            mid=i+(j-i)//2
            if nums[mid]<nums[j]:
                j=mid
            else:
                i=mid+1
            return i%len(nums)