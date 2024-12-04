class Solution:
    def romanToInt(self, s: str) -> int:
        roman_values = {
            'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M':1000 
        }
        result = 0
        i = 0
        while (i < len(s)-1):
            if roman_values[s[i]] < roman_values[s[i+1]]:
                result += roman_values[s[i+1]] - roman_values[s[i]]
                i += 2
            else:
                result += roman_values[s[i]]
                i += 1  
        if i < len(s):
            result += roman_values[s[-1]]
        return result