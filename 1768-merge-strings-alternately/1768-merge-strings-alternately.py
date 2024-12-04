class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        min_length = min(len(word1), len(word2))
        merged = ""
        for i in range(0, min_length):
            merged += word1[i]
            merged += word2[i]
        
        if len(word2) > min_length:
            merged += word2[min_length:]
        else:
            merged += word1[min_length:]
        
        return merged
    
    
# it's better use list because python recreate a new string every time is used concatenation "+="
'''
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = []
        for i in range(min(len(word1),len(word2))):
            result.append(word1[i] + word2[i])
            
        return ''.join(result) + word1[i+1:] + word2[i+1:]
'''