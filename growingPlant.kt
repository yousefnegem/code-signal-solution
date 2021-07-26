fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    var current = 0
    var days = 0
    while (current < desiredHeight) {
        days++
        current += upSpeed
        if (current >= desiredHeight) break
        current -= downSpeed
    }
    return days
}
