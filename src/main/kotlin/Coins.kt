object SilverCoin : Coin() {
    override var points = 2
    override val extraMoves = 0
    override val icon = Icon.SILVER_COIN
}

object GoldCoin : Coin() {
    override var points = 5
    override val extraMoves = 3
    override val icon = Icon.GOLD_COIN
}