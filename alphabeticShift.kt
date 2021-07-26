fun alphabeticShift(inputString: String): String {
    val str = inputString.toCharArray()
    var reslut = ""
    for(i in str.indices){
        if (str[i]>='z') str[i] = 'a' else str[i]++
        reslut +=str[i].toString()
    }
    return reslut
}
