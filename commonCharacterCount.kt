fun commonCharacterCount(s1: String, s2: String): Int {
    var count = 0
    val t = BooleanArray(s2.length)
    for (i in 0 until s1.length) {
        aaa@for (j in 0 until s2.length) {
            if (s1[i] == s2[j] && !t[j]) {
                t[j] = true
                count++
                break@aaa
            }
        }
    }
    return count
}