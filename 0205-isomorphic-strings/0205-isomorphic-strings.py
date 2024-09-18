class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        mapping = {}

        for s_char, t_char in zip(s, t):
            if s_char in mapping:
                if mapping[s_char] != t_char:
                    return False
            else:
                if t_char in mapping.values():
                    return False
                mapping[s_char] = t_char

        return True