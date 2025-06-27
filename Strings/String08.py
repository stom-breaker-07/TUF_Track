class Solution:
    def frequencySort(self, s: str) -> str:
        freq=Counter(s)
        sorted_chars=sorted(freq.items(),key=lambda x:x[1],reverse=True)
        ans=''.join( char * count for char,count in sorted_chars)
        return ans