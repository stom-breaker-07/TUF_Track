class Solution:
    def reverseWords(self, s: str) -> str:
        Str=s.split()
        Str.reverse()
        ans=" ".join(Str)
        return ans