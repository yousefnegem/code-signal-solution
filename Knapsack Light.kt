fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    var maxW = maxW
    var value = 0
    if (weight1 <= maxW && (value1 > value2 || weight2 > maxW) || weight1 + weight2 <= maxW) {
        value += value1
        maxW -= weight1
    }
    if (weight2 <= maxW) {
        value += value2
        maxW -= weight2
    }
    return value
}
