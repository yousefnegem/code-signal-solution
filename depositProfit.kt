fun depositProfit(deposit: Int, rate: Int, threshold: Int): Int {
    var year = 0
    var newDeposite = deposit.toDouble()
    while (newDeposite < threshold) {
        newDeposite += newDeposite * rate / 100.0
        year++
    }
    return year
}