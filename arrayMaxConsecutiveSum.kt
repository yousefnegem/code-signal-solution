fun arrayMaxConsecutiveSum(inputArray: MutableList<Int>, k: Int): Int {
    var suma1: Int
    var suma2 = 0
    for (i in 0 until k)
        suma2 += inputArray[i]
    suma1 = suma2
    for (i in k until inputArray.size) {
        val suma3 = suma2 - inputArray[i - k] + inputArray[i]
        if (suma3 > suma1) {
            suma1 = suma3
        }
        suma2 = suma3
    }
    return suma1
}
