fun absoluteValuesSumMinimization(a: MutableList<Int>): Int {
    return if (a.size % 2 == 0) {
        if (a[a.size / 2] > a[a.size / 2 - 1]) a[a.size / 2 - 1] else a[a.size / 2]
    } else {
        a[a.size / 2]
    }
}
