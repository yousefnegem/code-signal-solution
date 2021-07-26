fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    var firstNonmatchIndex: Int = -1
    var nonMatchCount = 0
    for (i in 0 until a.size) {
        if (a[i] != b[i]) {
            nonMatchCount++
            if (firstNonmatchIndex < 0) {
                firstNonmatchIndex = i
            } else if (a[firstNonmatchIndex] != b[i] || a[i] != b[firstNonmatchIndex] || nonMatchCount > 2) {
                return false
            }
        }
    }
    return true
}