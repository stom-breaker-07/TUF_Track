class Solution:
    def maxDepth(self, s: str) -> int:
        Max=0
        cnt=0
        for ch in s:
            if ch=='(':
                cnt+=1
                Max=max(Max,cnt)
            if ch==')':
                cnt-=1
        return Max