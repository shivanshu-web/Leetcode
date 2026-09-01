class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        str = s.strip()
        
        strr = str.split(" ")
        i = len(strr)-1
       



        
        return len(strr[i])
        