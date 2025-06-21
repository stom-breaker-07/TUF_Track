class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        n=[0]*len(nums)
        for num in nums:
            if n[num]==-1:
                return num
            n[num]=-1