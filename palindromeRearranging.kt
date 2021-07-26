fun palindromeRearranging(inputString: String): Boolean {
    val alphaCount = IntArray(26)

    for (element in inputString) {
        alphaCount[element.toInt() - 97]++
    }

    var odd = 0
    run {
        var j = 0
        while (j < alphaCount.size && odd <= 1) {
            if (alphaCount[j] % 2 == 1) {
                odd++
            }
            j++
        }
    }
    return odd <= 1
}