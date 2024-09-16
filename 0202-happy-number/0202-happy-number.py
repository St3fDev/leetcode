class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if (n < 0):
            return False
        squares = {}
        while(n != 1):
            n = sum(int(cifra)**2 for cifra in str(n))
            if n in squares:
                return False
            squares[n] = 1

        return True
        
        
        