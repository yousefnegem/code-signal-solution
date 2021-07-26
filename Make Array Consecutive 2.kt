fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    statues.sort()
    return  statues[statues.size - 1] - statues[0] + 1 - statues.size
}