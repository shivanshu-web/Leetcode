class Solution:
    def maxDistinct(self, s: str) -> int:
        a=[0]*26;
        for i in range(len(s)):
            if s[i] not in a:
                a[ord(s[i])-97]=s[i]
        su=0;
        for i in a:
            if i!=0:
                su+=1;
        return su;