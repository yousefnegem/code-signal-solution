fun stringsRearrangement(inputArray: MutableList<String>): Boolean {
    val permutations = permutations(inputArray)
    val twoStringSeparatedByOneChar = fun(s1: String, s2: String): Boolean {
        return s1.zip(s2).count { it.first != it.second } == 1
    }
    return permutations.any {
        (0 until it.size -1).all { i -> twoStringSeparatedByOneChar(it[i], it[i+1]) }
    }
}

fun <T> permutations(lst: List<T>): List<List<T>>{
    if(lst.size < 2) return listOf(lst)
    val perms = mutableListOf<MutableList<T>>()
    val fElem = lst[0]
    val remPerms = permutations(lst.drop(1))
    for (permutation in remPerms) {
        for (i in 0..permutation.size) {
            val mutableList = permutation.toMutableList()
            mutableList.add(i, fElem)
            perms.add(mutableList)
        }
    }
    return perms
}
