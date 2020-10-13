import exceptions.InvalidMoveException

fun main() {
    val board = Board.initializeBoard(10, 10)

    do {

        board.printBoard()
        val direction = readLine()?.toUpperCase()
        try {
            board.tryMove(direction)
        } catch (ex: InvalidMoveException) {
            println("INVALID MOVE: $direction, please enter W/A/S/D")
        }
    } while (board.hasMovesLeft())

    board.printEndScreen()
}
