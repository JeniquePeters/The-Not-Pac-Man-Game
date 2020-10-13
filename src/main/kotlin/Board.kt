class Board private constructor(val boardTiles: Array<Array<BoardItem>>, private var moves: Int = 10) {

    companion object {
        fun initializeBoard(size: Int): Board {
            println(
                "Let's Play\n" +
                        "Enter W/A/S/D to move"
            )
            TODO("Implement board")
        }
    }

}