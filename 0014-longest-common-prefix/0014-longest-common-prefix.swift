class Solution {
    func longestCommonPrefix(_ strs: [String]) -> String {
        if strs.isEmpty {return ""}

        var str = strs[0]
        for stringa in strs {
            while !stringa.hasPrefix(str) {
                str = String(str.dropLast())
            }
        }
        return str
    }
}