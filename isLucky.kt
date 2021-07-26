fun isLucky(n: Int): Boolean {
    var firthalf = 0
    var secondhalf = 0
    val str = n.toString().toList()
    val half = (str.size/2)
    for(i in 0 until half)
        firthalf +=str[i].toInt()
    for(i in half until str.size)
        secondhalf +=str[i].toInt()
    return firthalf == secondhalf
}