fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    var ood = 0
    var even = 0
    val result = mutableListOf<Int>()
    for (i in 0 until a.size){
        if(i%2==0) ood +=a[i] else even +=a[i]
    }
    result.add(ood)
    result.add(even)
    return result
}