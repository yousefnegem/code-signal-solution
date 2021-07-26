fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    val halfElement = n / 2
    return when {
        firstNumber + halfElement > n -> firstNumber - halfElement
        firstNumber + halfElement < n -> firstNumber + halfElement
        else -> 0
    }
}
