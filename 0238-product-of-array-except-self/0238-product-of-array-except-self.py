class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left_product = 1
        right_product = 1
        result = []
        for i in range(len(nums)):
            result.append(left_product)
            left_product *= nums[i]
        
        for i in range(len(nums)-1, -1, -1):
            result[i] *= right_product
            right_product *= nums[i]
            
        return result