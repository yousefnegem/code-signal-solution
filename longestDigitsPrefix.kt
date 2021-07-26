fun longestDigitsPrefix(inputString: String): String {
    return if (inputString.isNotEmpty() && inputString[0] >= '0' && inputString[0] <= '9')
        inputString[0]+ longestDigitsPrefix(inputString.substring(1))
    else ""
}
