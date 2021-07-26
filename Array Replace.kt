fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    for (i in 0 until inputArray.size)
        if (inputArray[i] == elemToReplace)
            inputArray[i] = substitutionElem
    return inputArray
}
