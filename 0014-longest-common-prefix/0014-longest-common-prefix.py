class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        common_prefix = ""
        strs = sorted(strs)
        first_str = strs[0]
        last_str = strs[-1]
        
        for i in range(min(len(first_str), len(last_str))):
            if first_str[i] != last_str[i]:
                return common_prefix
            common_prefix += first_str[i]
            
        return common_prefix
                