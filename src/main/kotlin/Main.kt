import exceptions.InvalidMoveException

fun main() {
    val board = Board.initializeBoard(10, 10)

    do {
        board.printBoard()
        val direction = readLine()?.toUpperCase()
    } while (board.hasMovesLeft())
    board.printEndScreen()
}


