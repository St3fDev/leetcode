class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        // nums = [1,1,2]
        var count = 0
        var i = 0
        while i < nums.count {
            var elem = nums[i]
            count+=1
            var j = i+1
            print("J: \(j) e len Nums: \(nums.count)")
            while j < nums.count {
                print("ENTRO")
                if nums[j] != elem {
                    break
                } 
                print("SONO DOPO L'IF: LEN NUMS: \(nums.count)")
                nums.remove(at:j)
                j = i+1
            }
            i += 1
        }
        print(count)
        return count
    }
}