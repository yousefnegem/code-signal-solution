fun chessBoardCellColor(cell1: String, cell2: String): Boolean {
    return ((cell1[0] - 'A') + (cell2[0] - 'A')) % 2 == ((cell1[1] - '1') + (cell2[1] - '1')) % 2
}
