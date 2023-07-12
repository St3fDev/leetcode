class Solution {
    func lengthOfLastWord(_ s: String) -> Int {
        var len = 0
        var space = true
        for char in s.reversed() {
            if char == " " && space == false {
                break
            } 
            else if char != " "{
                len += 1
                space = false
            }
        }
        return len
    }
}

/*func lengthOfLastWord(_ s: String) -> Int {
        guard let word = s.split(separator: " ").last else { return 0 }
        return word.count
    }
*/