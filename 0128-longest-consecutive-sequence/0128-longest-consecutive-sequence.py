class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        current_longest = 0
        nums = set(nums)
        result = 0
        
        for num in nums:
            if num - 1 not in nums:
                starter = num 
                current_longest = 0
                while starter in nums:
                    current_longest += 1
                    starter += 1
            
                result = max(current_longest,result)
            
        return result
        