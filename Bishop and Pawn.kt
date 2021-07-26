fun bishopAndPawn(bishop: String, pawn: String): Boolean {
    var answer = false
    val diff1 : Int = if (bishop[0] > pawn[0])
        bishop[0] - pawn[0]
    else
        pawn[0] - bishop[0]
    val diff2 : Int = if (bishop[1] > pawn[1])
        bishop[1] - pawn[1]
    else
        pawn[1] - bishop[1]
    if (diff1 == diff2)
        answer = true
    return answer
}
