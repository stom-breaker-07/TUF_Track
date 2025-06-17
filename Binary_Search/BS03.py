class Solution:
    def upperBound(self, nums, x):
        i,j=0,len(nums)
        while i<j:
            mid=i+(j-i)//2
            if nums[mid]>x: #There is no  = in  this is the major difference between the upper bound and lower bound
                j=mid
            else:
                i=mid+1
        return i