fun extractEachKth(inputArray: MutableList<Int>, k: Int): MutableList<Int> {
    val list: MutableList<Int> = mutableListOf()
    var nextToRemove = k
    for (i in inputArray.indices) {
        if (i + 1 == nextToRemove) {
            nextToRemove += k
            continue
        }
        list.add(inputArray[i])
    }
    return list
}
