fun addBorder(picture: MutableList<String>): MutableList<String> {
    val output = mutableListOf<String>()
    var border = ""
    for (i in 0 until picture[0].length + 2)
        border += "*"
    output.add(border)
    for (i in 0 until picture.size)
        output.add("*" + picture[i] + "*")
    output.add(border)
    return output
}