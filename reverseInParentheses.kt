fun reverseInParentheses(inputString: String): String {
    val list = ArrayList<Char>()
    for (i in inputString.indices) {
        list.add(inputString[i])
    }

    while (list.contains('(')) {
        val lastOfLeft = list.lastIndexOf('(')
        var firstFollowingRight = -1
        var i = lastOfLeft
        while (i < list.size && firstFollowingRight < 0) {
            val temp = list[i]
            if (temp == ')') {
                firstFollowingRight = i
            }
            i++
        }
        var front = lastOfLeft
        var end = firstFollowingRight
        while (front < end) {
            val t = list[front]
            list[front] = list[end]
            list[end] = t
            front++
            end--
        }
        list.removeAt(lastOfLeft)
        list.removeAt(firstFollowingRight - 1)
    }
    var result = ""
    for (k in list.indices) {
        result += list[k]
    }
    return result
}