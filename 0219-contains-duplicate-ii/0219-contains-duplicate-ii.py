class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        index_to_value = {}
        for i in range(0,len(nums)):
            if nums[i] not in index_to_value:
                index_to_value[nums[i]] = i
            else:
                index_to_value[nums[i]] -= i
                if abs(index_to_value[nums[i]]) <= k:
                    return True
                index_to_value[nums[i]] = i

        return False
        