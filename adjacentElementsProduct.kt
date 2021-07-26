fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var maxNumber = inputArray[0] * inputArray[1]
    for (index in 0 until inputArray.size-1){
        if(inputArray[index] * inputArray[index+1] >= maxNumber)
            maxNumber = inputArray[index] * inputArray[index+1]
    }
    return maxNumber
}