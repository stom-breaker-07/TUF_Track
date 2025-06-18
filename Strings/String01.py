class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        StrP=[]
        count=0
        for i in range(len(s)):
            if s[i]=='(':
                if(count>0):
                    StrP.append('(')
                count+=1
            else:
                count-=1
                if(count>0):
                    StrP.append(')')

        ans="".join(StrP)
        return ans