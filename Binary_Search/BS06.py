class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        first,last=-1,-1

        i,j=0,len(nums)-1
        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]==target:
                first=mid
                j=mid-1
            elif nums[mid]<target:
                i=mid+1
            else:
                j=mid-1


        i,j=0,len(nums)-1
        while i<=j:
            mid=i+(j-i)//2
            if nums[mid]==target:
                last=mid
                i=mid+1
            elif nums[mid]>target:
                j=mid-1
            else:
                i=mid+1

        return[first,last]