class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        new=s+s
        return len(goal)==len(s) and goal in new