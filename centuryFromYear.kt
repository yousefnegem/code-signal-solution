fun centuryFromYear(year: Int): Int {
    return if (year % 100 != 0)
        (year / 100) + 1 else (year / 100)
}