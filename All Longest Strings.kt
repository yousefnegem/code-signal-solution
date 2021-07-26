fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    var max = 0
    for(i in 0 until inputArray.size)
        if (inputArray[i].length >= max) max = inputArray[i].length
    return inputArray.filter { it.length == max }.toMutableList()
}