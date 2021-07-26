fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean
{
    var count = 0
    var error = 0
    for(i in 0..sequence.size - 2) {
        if(sequence[i] >= sequence[i + 1]) count++
        if(i != 0) {
            if(sequence[i - 1] >= sequence[i + 1]) error++
        }
    }
    return count == 1 && error <= 1
}