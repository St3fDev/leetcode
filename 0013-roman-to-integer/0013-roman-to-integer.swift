class Solution {
    func romanToInt(_ s: String) -> Int {
        var conversion = ["I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000]
        let string = Array(s)
        var intNumber = 0
        var previous = ""
        for romanNumber in string {
            let roman = String(romanNumber)
            intNumber += conversion[roman] ?? 0
            if previous == "I" && (roman == "V" || roman == "X") {
                intNumber -= 2
            }
            else if previous == "X" && (roman == "L" || roman == "C") {
                intNumber -= 20
            }
            else if previous == "C" && (roman == "D" || roman == "M") {
                intNumber -= 200
            }
            previous = roman
        }
        return intNumber
    }
}