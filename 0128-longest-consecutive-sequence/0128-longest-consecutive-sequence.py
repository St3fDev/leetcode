class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        nums = set(nums)
        result = 0 
        
        for num in nums:
            if num - 1 not in nums:
                current_num = num
                current_longest = 0
                
                while current_num in nums:
                    current_longest += 1
                    current_num += 1
                
                result = max(result, current_longest)
        
        return result

        