class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        for word in strs:
            str_ordered = ''.join(sorted(word))
            if str_ordered in anagrams:
                anagrams[str_ordered].append(word)
            else:
                anagrams[str_ordered] = [word]
                
        results = list(anagrams.values())  
        return results
        
        
                