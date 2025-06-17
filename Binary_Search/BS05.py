class Solution:
    def getFloorAndCeil(self, nums, x):
        floor,Ceil=-1,-1
        i,j=0,len(nums)-1

        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]>=x:
                Ceil=nums[mid]
                j=mid-1
            else:
                i=mid+1

        i,j=0,len(nums)-1

        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]<=x:
                floor=nums[mid]
                i=mid+1
            else:
                j=mid-1

        return [floor,Ceil]