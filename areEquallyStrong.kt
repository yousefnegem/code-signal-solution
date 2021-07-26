fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
    return (yourLeft == friendsRight && yourRight == friendsLeft) || (yourLeft == friendsLeft && yourRight == friendsRight)
}