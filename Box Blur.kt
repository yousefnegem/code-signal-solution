fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> =
    (1 until image.lastIndex).map { x ->
        (1 until image[x].lastIndex).map { y ->
            image.slice(x - 1..x + 1)
                .flatMap { it.slice(y - 1..y + 1) }
                .sum() / 9
        }.toMutableList()
    }.toMutableList()