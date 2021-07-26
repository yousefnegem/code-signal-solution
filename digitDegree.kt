fun digitDegree(n: Int): Int {
    var s: String = n.toString()
    var count = 0
    var i = 0
    var tempNumber = 0
    while (s.length > 1 && i < s.length) {
        val currentDigit: Int = s[i] - '0'
        tempNumber += currentDigit
        if (i == s.length - 1) {
            count++
            i = 0
            s = tempNumber.toString()
            tempNumber = 0
            continue
        }
        i++
    }
    return count
}
