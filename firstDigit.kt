fun firstDigit(inputString: String): Char {
    for (i in inputString.indices) if (inputString[i] in '0'..'9') return inputString[i]
    return 'd'
}
