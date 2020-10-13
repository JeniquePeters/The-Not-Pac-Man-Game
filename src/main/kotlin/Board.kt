class Board private constructor(private val boardTiles: Array<Array<BoardItem>>,
                                private val size : Int,
                                private var moves: Int = 10) {

    private val avatar: Avatar  = Avatar(Position(0,0))

    companion object {
        fun initializeBoard(size: Int): Board {
            println(
                "Let's Play\n" +
                        "Enter W/A/S/D to move"
            )
            val baseBoard : Array<Array<BoardItem>> = Array(size) { Array(size) { Tile } }

            val gameBoard = Board(
                baseBoard,
                size,
                10)

            return gameBoard
        }
    }

    fun printBoard() {
        println("NUMBER OF MOVES LEFT : $moves")

        boardTiles.forEach { rowArray ->
            println(rowArray.joinToString(" ") { boardItem -> boardItem.icon.character })
        }
    }
    fun printEndScreen() {
        println("YOU HAVE NO MOVES LEFT 😭")
        println()
        println("FINAL SCORE: ${avatar.totalPoints}!")
    }

}