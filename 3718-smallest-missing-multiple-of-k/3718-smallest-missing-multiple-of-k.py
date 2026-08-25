class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        n=k;
        f=0;
        while(f==0):
            if(n not in nums):
                f=1;
            n+=k;
        return n-k;