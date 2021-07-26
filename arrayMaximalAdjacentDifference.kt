fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var max = 0
    var dif = 0
    for (i in 0 until inputArray.size - 1) {
        if (inputArray[i] >= inputArray[i + 1]){
            dif = (inputArray[i] - inputArray[i + 1])
        } else {
            dif = inputArray[i + 1] - inputArray[i]
        }
        if (dif > max) { max = dif }
    }
    return max
}