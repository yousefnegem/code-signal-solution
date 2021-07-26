fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
    val out : MutableList<MutableList<Int>> = mutableListOf()
    val n=matrix.size-1
    val m=matrix[0].size-1
    for(i in 0..n){
        out.add(mutableListOf())

        for(j in 0..m){
            var count=0
            if ((j<m) && matrix[i][j+1])          count++
            if ((j<m)&&(i<n) && matrix[i+1][j+1]) count++
            if ((i<n) && matrix[i+1][j])          count++
            if ((j>0)&&(i<n) && matrix[i+1][j-1]) count++
            if ((j>0) && matrix[i][j-1])          count++
            if ((j>0)&&(i>0) && matrix[i-1][j-1]) count++
            if ((i>0) && matrix[i-1][j])          count++
            if ((i>0)&&(j<m) && matrix[i-1][j+1]) count++
            out[i].add(count)
        }

    }
    return out
}
