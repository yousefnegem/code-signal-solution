fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    var temp: Int
    for (i in 0 until a.size) {
        for (j in 0 until a.size) {
            if (a[i] == -1) {
                continue
            } else if (a[j] >= a[i]) {
                temp = a[i]
                a[i] = a[j]
                a[j] = temp
            }
        }
    }
    return a
}