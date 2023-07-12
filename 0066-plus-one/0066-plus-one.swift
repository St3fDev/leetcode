class Solution {
    func plusOne(_ digits: [Int]) -> [Int] {
        var i = digits.count - 1
        var result = digits
        for digit in digits.reversed() {
            if digit < 9 {
                result[i] += 1
                break
            }    
            result[i] = 0
            if i == 0 {
                result.insert(1,at:0)
            }
            i -= 1
        }
        return result
    }
}