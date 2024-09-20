class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s = s.split()
        pattern = list(pattern)
        if len(s) != len(pattern):
            return False
        pattern_to_word = {}
        for i in range(0,len(s)):
            if pattern[i] in pattern_to_word and pattern_to_word[pattern[i]] != s[i]:
                return False
            elif pattern[i] not in pattern_to_word and s[i] in pattern_to_word.values():
                return False
            
            pattern_to_word[pattern[i]] = s[i]
        return True