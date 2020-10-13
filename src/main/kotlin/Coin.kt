abstract class Coin : BoardItem {
    abstract var points: Int
    abstract val extraMoves: Int
    override val canWalkOn = true
}