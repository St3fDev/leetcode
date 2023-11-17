class Solution(object):
    def balancedStringSplit(self, s):
        result = 0
        cont = 0
        for ch in s:
            if ch == "L":
                cont += 1
            else: 
                cont -= 1
            if cont == 0:
                result += 1
        return result