class Board private constructor(
    private val boardTiles: Array<Array<BoardItem>>,
    private val size: Int,
    private var moves: Int = 10
) {

    private val avatar: Avatar = Avatar(Position(0, 0))

    companion object {

        fun initializeBoard(size: Int, walls: Int): Board {
            println(
                "Let's Play\n" +
                        "Enter W/A/S/D to move"
            )

            val baseBoard: Array<Array<BoardItem>> = Array(size) { Array(size) { Tile } }

            val gameBoard = Board(
                baseBoard,
                size ,
                10
            )

            gameBoard.addSurroundingWalls()
            gameBoard.addItems(Wall, walls)
            gameBoard.addItems(SilverCoin, 10)
            gameBoard.addItems(GoldCoin, 4)
            gameBoard.addAvatar()

            return gameBoard
        }
    }

    private fun addSurroundingWalls() {
        boardTiles.forEach { column ->
            column[0] = Wall
            column[size - 1] = Wall
        }
        boardTiles[0] = Array(size) { Wall }
        boardTiles[size - 1] = Array(size) { Wall }
    }

    private fun addAvatar() {
        val x = (1 until size - 1).random()
        val y = (1 until size - 1).random()

        boardTiles[x][y] = avatar
        avatar.location = Position(x, y)
    }

    private fun addItems(boardItem: BoardItem, amount: Int) {
        repeat(amount) {
            val x = (1 until size - 1).random()
            val y = (1 until size - 1).random()

            boardTiles[x][y] = boardItem
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

    fun hasMovesLeft(): Boolean {
        return (moves > 0)
    }

}