fun isIPv4Address(inputString: String): Boolean {
    var c = 0
    if(inputString != "")
        if(inputString.contains('.'))
        {
            val subInputString = inputString.split('.')
            if(subInputString.size==4)
            {
                for(i in subInputString.indices)
                {
                    if((subInputString[i] == ""))
                        c+=1
                    else if(!isNumber(subInputString[i]))
                        c +=1
                    else if((subInputString[i].toLong() !in 0..255) )
                        c +=1
                    else if(!beginZero(subInputString[i]))
                        c +=1
                }
                return c < 1
            }
            else
                return false

        }else
            return false
    else
        return false
}
fun beginZero(str:String):Boolean{
    return !((str[0] == '0')&&(str.length>1))
}
fun isNumber(str:String):Boolean{
    var c = 0
    for(element in str)
        if(element.toInt() !in 47..58)
            c += 1
    return c==0
}
