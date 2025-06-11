class Solution:
    def secondLargestElement(self, nums):
        max,smax=float('-inf'),float('-inf')
        for cur in nums :
            if cur>max :
                smax=max
                max=cur
            elif max>cur>smax :
                smax=cur
        return smax if smax != float('-inf') else -1

