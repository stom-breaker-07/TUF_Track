class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False

        snt={}
        tns={}

        for i in range (len(s)):
            T=t[i]
            S=s[i]

            if S in snt:
                if snt.get(S)!=T:
                    return False
            else :
                snt[S]=T

            if T in tns:
                if tns.get(T)!=S:
                    return False
            else :
                tns[T]=S

        return True