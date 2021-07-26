fun checkPalindrome(inputString: String): Boolean {
    return if (inputString.isNotEmpty())
        inputString == inputString.reversed()
    else
        false
}