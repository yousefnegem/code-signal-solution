fun arrayChange(inputArray: MutableList<Int>): Int {
    var sum = 0
    for (i in 0 until inputArray.size - 1) {
        if (inputArray[i + 1] <= inputArray[i]) {
            val t = inputArray[i] - inputArray[i + 1] + 1
            sum += t
            inputArray[i + 1] = t + inputArray[i + 1]
        }
    }
    return sum
}