fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var sum = 0
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            if (matrix[i][j] == 0 && i + 1 < matrix.size) {
                matrix[i + 1][j] = 0
            }
            if (matrix[i][j] > 0) sum += matrix[i][j]
        }
    }
    return sum
}