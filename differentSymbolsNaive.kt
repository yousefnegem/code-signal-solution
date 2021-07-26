fun differentSymbolsNaive(s: String): Int {
    var count = 0
    var location = 'a'
    while (location <= 'z') {
        if (s.indexOf(location) != -1) count++
        location++
    }
    return count
}
